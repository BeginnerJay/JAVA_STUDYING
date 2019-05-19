package chapter12;

public class HumanStudentTest {
    // introHuman 메서드로 사람 객체를 전달해 보기도 하고, 학생 객체를 전달해 보기도 했다.
    // 전달한 객체는 형식 인수 who로 대입되는데, 이 때 메서드의 본체에서 호출하는 who.intro는 과연 누구의 메서드??
        // 실행해 보면 각 클래스의 intro 메서드가 호출된다.
    // 코드의 모양은 같지만 상황에 따라 결과가 달라지는 것. 이것이 바로 다형성이다.

    // 클래스의 계층을 형성해 두면, 부모 타입의 변수로 파생 클래스의 모든 객체를 받을 수 있다.
        // 부모 타입은 후손을 위한 대표 타입이 된다.
            // 이 타입의 변수로 메서드를 호출하면, 객체의 실제 타입에 맞는 메서드가 호출된다.
    static void introHuman(Human who) {
        who.intro();
    }

    public static void main(String[] args) {
        Human cho = new Human(26,"조성우");
        Student kim = new Student(26,"김재욱",13123313,"경영학");

        cho.intro(); // Human 객체의 메서드
        kim.intro(); // Student 객체의 메서드

        System.out.println();
        System.out.println("*****************");

        introHuman(cho);
        introHuman(kim);
    }
}
