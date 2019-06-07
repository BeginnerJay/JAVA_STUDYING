package chapter22;

public class AnnonymousTest {
    public static void main(String[] args) {
        Mankind lee = new Mankind() {
            @Override
            public void intro() {
                System.out.println("나는 학생입니다.");
            }
        };

        lee.intro();
    }
}
/*
익명 클래스의 특징
    상속, 재정의, 객체 생성이 하나의 구문으로 일괄 처리 -> 딱 하나의 객체만 생성 가능
    내부적으로 상속되므로 딱 하나의 부모만 가질 수 있다.
        클래스를 상속받으며, 인터페이스를 구현한다거나 두 개 이상의 인터페이스로부터 상속받지 못한다.
    이름이 없어 생성자를 정의할 수 없다.(보통 필드가 없어 딱히 초기화할 것이 없다)

여러 개의 객체를 생성한다거나, 부모가 여럿이라면 익명 클래스를 사용해서는 안 되며, 평이한 문법을 사용해야 한다.
 */