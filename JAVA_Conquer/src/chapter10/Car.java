package chapter10;
// 멤버는 객체가 생성될 때마다 각각의 메모리 할당받음. 객체별로 다른 값을 가질 수 있다.
// 그러나 메서드는 공통적인 동작을 정의 -> 객체별로 따로 가질 필요가 없다.
    // 그래서 메서드는 클래스가 로드되는 정적 영역에 딱 한 번만 할당되어 배치되며, 모든 객체가 공유한다.
// 그런데 메서드는 각 객체의 멤버를 참조하기 때문에 동작이 달라진다.
    // 그러면 메서드가 참조하는 멤버가 누구의 멤버인지 어떻게 알지?
    // 원칙적으로는 메서드를 호출할 대에 달릴 대상을 인수로 전달해야 한다(Python)
    // 자바에서는 그것을 컴파일러가 this라는 인수로 자동으로 처리한다.
        // 메서드 내에서 this는 자기 자신을 의미하며, 멤버 참조문은 this를 통해 호출 객체의 멤버를 읽는다.
        // 컴파일러는 this를 메서드 호출문 앞에 호출 객체를 명시한 부분에서 읽는다.
// 정적 필드
    // 정적 필드는 개별 객체에 소속되지 않고, 클래스에 직접 소속되어 모든 객체가 공유한다.
// 정적 메서드도 특정 객체의 동작을 처리하는 것이 아니라, 클래스 전체에 대한 전반적인 처리를 담당한다.
    // 객체와 연관되지 않아 객체가 없어도 호출 가능. 클래스명으로 바로 부를 수 있다.
    // 정적 메서드는 정적 변수만 참조 가능, 인스턴스 변수나 지역 변수는 참조 불가능.
    // 정적 메서드끼리만 호출 가능, 일반 메서드는 호출할 수 없음.
    // 객체와 상관없는 독립(객체로부터 호출X, 객체 無여도 호출可)적인 메서드로 이해하는 것이 직관적이다.
public class Car {
    String name;
    boolean gasoline;
    //int carNum;
    static int carNum = 0; // 명시적 초기화

    public Car(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
        carNum++;
    }

    static void resetNum() {
        carNum = 0;
    }

    static void printNum() {
        System.out.printf("현재 출고 대수 : %d\n", carNum);
    }

    void run() {
        if (gasoline==true) {
            System.out.println("부릉 부릉");
        } else {
            System.out.println("덜컹 덜컹");
        }
    }
}
// 정적 필드는 개별 객체가 아닌 클래스에 소속되며, 딱 하나밖에 없다.
// 정적 필드를 참조할 때에는 '클래스.필드'라고 표기한다. 객체 명을 표기할 수는 있지만 경고 표시가 뜬다.
// 정적이라는 용어는 객체가 생성될 대 동적으로 할당되는 것이 아니라, 클래스가 로드될 때 미리 할당된다는 뜻이다.