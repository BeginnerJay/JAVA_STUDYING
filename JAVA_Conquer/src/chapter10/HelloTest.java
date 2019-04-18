package chapter10;
// 프로그램의 시작인 main method도 static method이다.
    // 만약 main이 정적 메서드가 아닌 일반 메서드라면 객체를 먼저 생성한 뒤 호출해야 한다.
    // 그런데 가상 머신으로부터 제어를 넘겨받기 전이므로 객체를 먼저 생성할 수가 없다.

    // 프로그램을 기동하는 첫 메서드는 객체 없이 호출해야 -> static
    // 프로그램 외부인 JVM에서 호출 -> public
    // return 값 없음 -> void
class HelloTest {
    public static void main(String[] args) {
        Hello.morning();
        Hello.lunch();
        Hello.evening();
    }
}
// 단순히 인사말을 출력할 뿐 객체의 고유한 정보를 참조하지 않는다.
// 그래서 정ㅈ거으로 선언되었으며, 객체를 선언할 필요 없이 Hello.method 형식으로 호출한다.

// Hello class는 세 개의 static method를 하나의 범주로 묶는 namespace 역할만 한다.
    // 완벽한 객체 지향 언어인 자바에서는 메서드가 홀로 존재할 수 없고, 클래스에 소속되어야 한다.
    // 그래서 일단 클래스를 선언하고, 그 안에 static method를 선언한다.

// System.out.println에서 out은 System class의 static member variable, println은 out의 static variable이다.

// main이 자신이 속한 클래스의 객체를 생성하면 어색하고 클래스의 재활용성이 떨어진다.
// 그래서 별도의 응용 프로그램 클래스를 만들고, 이 안에 main method를 둔다.