# Mythical Man-Month

### The Tar Pit

Human Nature is to create

한국에서 주로 사용하는 단어인 스파게티 코드를 저서에선 tar pit이라고 한다. 

주로 프로그램이 망하는 이유로는 시간이 부족하다는 데에 있다 

대부분 사람들은 자신이 프로그래밍에 뛰어나다고 생각한다. 상위 10% 정도에는 속한다고 여기는 것이다. 현업에서 10년 이상 일을 한 사람이라면 특히 더 그런 경향이 강할 것이다.

그러나, 분포상으로 모두가 상위 10%에 존재할 수 없다. 

+10 ~ +1 각자의 몫을 해낼 수 있는 프로그래머가 있다면, 10배 정도의 몫을 해내는 사람도 있을 것이다.  10배의 몫을 하는 사람은 단순히 주어진 문제를 해결하는 것만이 아닌, 새로운 문제를 찾아서 해결하려 할 것이다.

그렇다면 0 zero contributor로 존재하는가. 하루 종일 쓴 코드가 다른 사람에게 주어졌을 때 디버깅하는 데에만 하루가 걸리거나, 협업하기 어려운 프로그래머일 경우에 해당될 것이다. +10 프로그래머가 존재하는 것처럼 -10에 해당하는 프로그래머도 존재할 것이다. 예를 들어 리눅스를 사용하면 안 된다는 부당한 요구를 하는 경우가 있을 것이다. 조직 전체의 효율성을 떨어뜨리는 일이 된다. 

### Optimism

왜 낙관적으로 생각하는가

집 짓는 것을 생각해보자. 물리적으로 짓는 집은 자신의 실력, 전문성, 커뮤니케이션 능력이 부족함이 바로 드러난다. 

그러나 컴퓨터 프로그래밍은 설계 단계에서 구현에 적은 어려움이 있을 것이라고 예측한다. 집 짓는 것과 다르게 프로그래밍은 tractable하다. 집 짓는 일은 아이디어부터 실제 구현까지 걸리는 시간이 있다. 바로 실현 가능한 프로그래밍과는 다르다. 

Root of all evil is Optimism이라고 한다. 

1. 낙관적이기 때문에 버그 발생 가능성을 과소평가하고, test하는 시간을 적게 계획한다. 
    1. 자신이 optimist라는 것을 유념하고 있어야 한다. 

### Man Month

1. 일을 완수하는 데에 필요한 월 인원의 수 man per month
    1. 두 명이면, 개발 시기가 반으로 줄어듦
2. 협업 간 사람 사이의 소통이 없을 경우, man month가 성립
3. 소프트웨어 프로젝트의 경우, 훈련과 상호 협력을 통해 급진적으로 기간이 줄어들 수 있음
4. Time versus Number of Worker
    1. 사람이 늘어날수록 일이 무조건적으로 줄어드는 것이 아님
    2. 오히려 더 기간이 늘어날 수 있음 
    

### System Tests

1. component 디버깅과 system test는 순서대로 발생하는 제약 조건이다. 
2. 낙관주의 때문에 현재 단계에서 버그가 발생하고 이후에 발생할 버그를 고려하지 않으면 
    1. Rule of thumb - 시간의 반 정도를 debugging 과 testing에 소요함
    2. 따라서 개발 시간의 2배 정도를 곱해두자 

### You should always be aware of TIME

1. 따라서, shell script에 익숙해지도록 하자
2. Reduce Communication Overhead
    1. w/ myself, w/ coworkers
    2. 문서화