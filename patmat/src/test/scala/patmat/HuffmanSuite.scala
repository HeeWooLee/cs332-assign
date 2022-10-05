package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
	trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
    val t3 = Leaf('a', 2)
    val t4 = Fork(Leaf('d',4), Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), List('d','a','b'), 9)
  }


  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }


  test("weight of a singe tree (10pts)") {
    new TestTrees{
      assert(weight(t3) === 2)}
  }
  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a','b','d'))
    }
  }
  
  test("chars of a single tree (10pts)") {
    new TestTrees{
      assert(chars(t3) === List('a'))}
  }



  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }


  test("times aba") {
    assert(times(List('a', 'b', 'a')) === List(('a', 2), ('b', 1)))
  }

  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e',1), Leaf('t',2), Leaf('x',3)))
  }


  test("singleton tree") {
    new TestTrees{
      assert(singleton(List(Leaf('e',1))), "single")
      assert(!singleton(List(Leaf('e',1), Leaf('t',2), Leaf('x',3))), "multiple")}
  }

  test("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3), Leaf('x',4)))
  }



  test("until"){
    new TestTrees{
      val trees =  List(Leaf('a',2), Leaf('b',3), Leaf('d',4))
      assert(until(singleton, combine)(trees) === List(t4))}
  }
  test("createCodeTree aabbbdddd"){
    new TestTrees{
      assert(createCodeTree(string2Chars("aabbbdddd")) === t4)}
  }

  test("decode and encode a very short text should be identity (10pts)") {
    new TestTrees{
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)}
  }
  test("covert and mergeCodeTables"){
    new TestTrees{
      val codeTable = List(('a', List(0,0)), ('b', List(0,1)), ('d', List(1)))
      assert(convert(t2) === codeTable)}
  }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }
  
  test("quickEncode"){
    new TestTrees{
      assert(quickEncode(frenchCode)(decodedSecret) === secret)}
  }

}
