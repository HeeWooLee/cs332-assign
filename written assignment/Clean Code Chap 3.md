# Clean Code Chap. 3

# Functions

### First Rule

- small
- do one thing
- method should be less than 30 lines

### Argument Objects

- 함수로 넘어가는 argument의 개수를 의미적으로 묶어 줄이자
    - (double x, double y) → Point center

### Do One Thing At A Time and Do It Well

- 기능적으로 단 한 가지 일만 하도록 하자
- 여러 가지 기능을 해야 한다면, 동사를 여러 개를 이어서 쓰자

### Use Descriptive Names

- 설명하는 목적이라면 긴 이름을 쓸 수 있음

### Have No Side Effects

- 함수형 프로그래밍을 이용하여 최대한 발생 가능성을 줄이도록 하자
- 이름에 side effect가 발생할 수 있음을 명시하거나 최소 주석으로 남기도록 하자

### Command & Query Separation

- Command 와 Query를 포함한다면, 두 가지의 기능을 포함하는 이름을 짓도록 하자