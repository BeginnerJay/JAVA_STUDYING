package chapter6;
/*
프로그램을 구현하다 보면, 여러 개의 인스턴스가 필요한 경우도 있고, 하나의 인스턴스만 필요한 경우도 있다.
OOP에서 인스턴스를 단 하나만 생성하는 디자인 패턴을 Singletone Pattern 이라고 한다.
그 중에서 static을 응용하여 프로그램 전반에 사용하는 인스턴스를 하나만 구현해 보자.
실무나 여러 프레임웤에서 자주 사용하는 패턴 -> 응용하여 프로그램을 구현할 수도 있다.
 */

/*
싱글톤 패턴으로 회사 클래스 구현하기
    1. 생성자를 private로 만들기
        생성자가 public이면 외부 클래스에서 인스턴스를 여러 개 생성할 수 있다.
        따라서 싱글톤 패턴에서는 생성자를 반드시 명시적으로 만들고(default constructor는 public)
        그 접근 제어자를 private로 지정해야 한다.
    2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
        프로그램에서 사용할 단 하나의 인스턴스는 필요하다.
        따라서 Company 클래스 내부에서 하나의 인스턴스를 생성하자.
        이것이 프로그램 전체에서 사용할 유일한 인스턴스가 된다.
        또한 private로 선언하여, 외부에서 이 instance로 access하지 못하도록 해야 인스턴스 오류 방지 가능.
    3. 외부에서 참조할 수 있는 public method 만들기
        외부에서 인스턴스를 만들거나 직접 접근하지 못하도록 하였다.
        이제 private로 선언한 유일한 인스턴스를 외부에서 사용할 수 있도록 설정해야 한다. -> generate public method
        그리고 유일하게 생성한 그 인스턴스를 반환해 준다.
        이 때 instance를 return하는 method는 반드시 static으로 선언해야 한다.
        왜냐 하면 getInstance() method는 instance 생성과 상관없이 호출할 수 있어야 하기 때문이다.
        (static 변수는 인스턴스가 생성되기 전에, 미리 프로그램의 시작과 함께 생성됨)
    4. 실제로 사용하는 코드 만들기
        외부 클래스에서는 Company를 생성할 수 없으므로, static으로 제공되는 getInstance() method를 호출한다.
        Company.getInstance();와 같이 호출하면 반환값으로 유일한 인스턴스를 받아온다.
        즉 몇 번을 호출하더라도 변수의 주소값은 같다.
 */
public class Company {
    private Company() {} // 1. generate private constructor
    private static Company instance = new Company(); // 2. construct the only instance

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company(); // 3. implement public get() method in order to refer to instance outside
        }
        return instance;
    }
}
