package chapter22;

public class AnnonymousHumanTest {
    public static void main(String[] args) {
        class AnnonymousStudent extends AnnonymousHuman {
            @Override
            void intro() {
                // super.intro();
                System.out.println("나는 학생입니다.");
            }
        }

        AnnonymousStudent cho = new AnnonymousStudent();
        cho.intro();
    }
}
/*
지역 클래스도 클래스이다. 그래서 상속, 재정의 등 모든 객체 지향 기법을 사용할 수 있다.
지역 클래스끼리 그럴 경우는 거의 없다.

그래서 메서드의 동작을 수정하기 위해, 상속을 받고 재정의한 후, 객체까지 만드는 것은 너무 번거롭다.
그래서 이 과정을 간편하게 처리하기 위해 익명 클래스라는 축약된 문법이 제공된다.
 */