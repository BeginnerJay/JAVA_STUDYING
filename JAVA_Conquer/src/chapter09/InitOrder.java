package chapter09;
// 기본값 -> 명시적 초기화 -> 초기화 블록 -> 생성자 순서로 초기화된다.
class InitOrder {
    int field = 1; // 명시적 초기화

    {
        field = 2; // 초기화 블록
    }

    InitOrder() {
        field = 3; // 생성자
    }
}

class InitTest {
    public static void main(String[] args) {
        InitOrder init = new InitOrder();
        System.out.println(init.field);
    }
}
// 모든 객체에 공통적인 값이나 단순한 리터럴로 초기화한다면, 앞 순서의 더 간단한 방법을 사용하자.