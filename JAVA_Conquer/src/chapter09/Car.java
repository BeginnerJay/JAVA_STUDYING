package chapter09;

class Car {
    String name;
    boolean gasoline;
    // 재초기화 기능 넣기
    // 사용하던 객체를 처음 상태로 되돌린다거나, 깨끗한 상태로 리셋할 때에 사용한다.
    // 원래는 새로운 객체를 만드는 것이 원칙, 기존 객체 재 초기화는 불필요하고 바람직하지도 않다.
    // 그래서 생성자를 임의로 다시 호출할 수는 없지만, 문법을 우회해 초기화 메서드를 만든다.
    Car() {}

    Car(String name, boolean gasoline) {
        init(name, gasoline); // 생성자에서 초기화 메서드 호출
    }
    // 초기화 메서드(꼭 필요한 경우만 이렇게 할 것!)
    void init(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
    }

    /*
    Car() {} // default constructor 굳이 생성

    Car(String aName, boolean gasoline) {
        name = aName; // name = name 대입문은 자신의 값을 스스로에게 대입하는 의미없는 동작 -> 초기화 불능
        this.gasoline = gasoline; // 완전한 중복만 피하면 되는 문제(인수, 필드 구분만 중요)->this 연산자 사용
    }
    */
    void run() {
        if (gasoline==true) {
            System.out.println("부릉 부릉");
        } else {
            System.out.println("덜컹 덜컹");
        }
    }
    void stop() {
        System.out.println("끼이익");
    }
}
// Car 클래스는 단순해서 default 생성자가 별반 할 일이 없고, 인수를 전달받지 않아 필드를 초기화할 수도 없다.
// 복잡한 클래스는 필드 초기화 외에도 네트웍 연결이나 DB 오픈 등의 작업이 필요하다.
// 이런 작업은 인수 없이도 할 수 있어 디폴트 생성자가 처리한다.
// 디폴트 생성자는 객체 자동 생성이나 직렬화 등에 꼭 필요하며, 이런 클래스에는 디폴트 생성자가 필수다.