# Clean Code Chap. 2

## Chap2. Meaningful Names

### Use Intention-Revealing Names

- 변수, 함수, 클래스명을
    - 존재 이유
    - 의미
    - 사용 방식
- 에 따라 작성 → 주석을 사용한다면, 의도를 제대로 드러내지 못하고 있다는 것
- 동일하게 작성된 코드이지만 변수의 이름에 따라 문장처럼 읽히는 정도가 다름.

### Avoid Disinformation

- 약어 사용 x
- 변수명이 매우 길고 조금의 철자만 다르지 않은 이상, 비슷한 컨셉끼리는 철자도 비슷하게 유지하자

### Make meaningful distinctions

- suffix 를 붙여서 다른 변수인 것을 표시하는 것보다, 다른 이름을 부여하여 구분하자
- Info 와 Data 같이 뜻이 크게 다르지 않는 단어를 혼용하지 말자
- a 를 로컬 변수에 사용하고, the를 function argument에 구분하는 용도로 사용하지 않는 이상 사용을 자제하자

### Use Pronounceable Names

- 발음 가능해야 논의도 쉽다. 발음 가능한 변수 이름을 짓자

### Use Searchable Names

- one alphabet 변수명이나, constant는 검색이 어려움. 길거나 constant에 붙인 이름이 있을수록  검색이 가능하다
- 짧은 method의 로컬 변수가 아닌 이상 single letter name은 자제하자
- 이용되는 scope에 비례하는 길이의 변수명을 짓는 것도 방법.

### Avoid Mental Mapping

- single letter name을 loop counter로 쓰는 건 전통임. 다른 경우에 사용하여 생각을 하도록 하지 말자.

### Class Names & Method Names

- Class name은 명사로, method 이름은 동사로 시작하도록 하자
- accessors, mutators, predicates

### Don’t be Cute

- 구어체나 slang을 사용하지 않도록 하자

### Pick One Word per Concept & Don’t Pun

- 하나의 concept을 위한 단어들 중 하나를 선택하고 고수하자
    - retrieve, fetch, get
    - manager, controller

### Use Solution Domain Names

- 코드를 읽는 사람은 프로그래머들이다
- CS 단어를 적극적으로 사용하자
    - 데이터 구조, 패턴 이름, 알고리즘 명

### Use Problem Domain Names

- 프로그래머용으로 사용할 단어가 없는 경우, domain specific 하게 짓도록 하자

### Add Meaningful Context

- prefix로 하나의 주소지를 나누거나, 여러 기능을 하는 긴 함수명을 짓기보다
- 세분화하고 함수를 여러 기능으로 쪼개도록 하자

### Don’t Add Gratituous Context

- prefix를 만들어 구분짓기보다 하나의 class를 만들고 상속으로 정리하는 것이 더 명료한 방식일 수 있다

### Final Words

- 변수명을 바꾸는 일을 두려워 말자
- 문장처럼 읽히는 가독성 좋은 코드는 모두 감사할만한 일이다