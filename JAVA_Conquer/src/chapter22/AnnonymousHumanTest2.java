package chapter22;

public class AnnonymousHumanTest2 {
    public static void main(String[] args) {
        AnnonymousHuman cho = new AnnonymousHuman() {
            void intro() {
                // super.intro();
                System.out.println("나는 학생입니다.");
            }
        };
    }
}
/*
Human 타입의 lee 객체를 생성하면서 intro 메서드를 재정의했다.
상속과 메서드 재정의는 물론이고, 객체 생성까지 한 번에 다 처리하는 문법이다.
이런 클래스를 익명 내부 클래스라고 한다.

익명 클래스는 상속과 재정의, 객체 생성을 위해 사용하는 일회용 클래스이다.
 */