package funsets

/**
 * This class is a test suite for the methods in object FunSets.
 *
 * To run this test suite, start "sbt" then run the "test" command.
 */
class FunSetSuite extends munit.FunSuite:

  import FunSets.*

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets:
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)

  /**
   * This test is currently disabled (by using @Ignore) because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", remove the
   * .ignore annotation.
   */
  test("singleton set one contains one") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets:
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
  }

  test("union contains all elements of each set") {
    new TestSets:
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
  }

  
  test("intersect contains all elements both in set") {
    new TestSets:
      val m = union(s1, s2)
      val n = union(s2, s3)
      val s = intersect(m, n)
      assert(!contains(s, 1), "Intersect 1")
      assert(contains(s, 2), "Intersect 2")
      assert(!contains(s, 3), "Intersect 2")
  }

  
  test("difference contains all element both in set but not in another set") {
    new TestSets:
      val m = union(s1, s2)
      val n = union(s2, s3)
      val s = diff(m, n)
      assert(contains(s, 1), "Intersect 1")
      assert(!contains(s, 2), "Intersect 2")
      assert(!contains(s, 3), "Intersect 2")
  }
  
  
  test("filter contains all element that holds given predicate") {
    new TestSets:
      val m = union(s1, s2)
      def isEven(i: Int) = (i%2==0)
      val s = filter(m, isEven)
      assert(!contains(s, 1), "Filter 1")
      assert(contains(s, 2), "Filter 2")
  }

  test("exists checks whether there exists a element that satisfies given predicate"){
    new TestSets:
      val m = union(s1, s2)
      val n = singletonSet(1001)
      def isEven(i: Int) = (i%2==0)
      val s = exists(m, isEven)
      val t = exists(n, isEven)
      assert(s, "Exists 1")
  }

  test("map transform each element according to given function"){
    new TestSets:
      val m = union(s1, s2)
      def makeDouble(i:Int) = (2*i)
      val s = map(m, makeDouble)
      assert(contains(s,2), "Map 1")
      assert(contains(s,4), "Map 2")
      assert(!contains(s,1), "Map 3")
  }

  import scala.concurrent.duration.*
  override val munitTimeout = 10.seconds
