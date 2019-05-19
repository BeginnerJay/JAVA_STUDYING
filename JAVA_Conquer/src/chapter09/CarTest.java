package chapter09;
// 클래스는 실세계 사물에 대한 틀일 뿐, 그 자체가 사물은 아니다.
// 그러므로 이 클래스 타입을 사용하려면 실제 객체를 생성해야 한다.
class CarTest {
    public static void main(String[] args) {
        Car korando = new Car(); // default constructor
        korando.name = "코란도 C";
        korando.gasoline = false;

        korando.run();
        korando.stop();
    }
}
// 실제 자동차는 Car type object로 만든다.
// 클래스는 기본형과 달리 변수를 선언한다고 해서 객체가 생성되지 않으며, new 연산자로 메모리를 할당해야 한다.
// 객체의 멤버나 메서드를 참조할 때에는 . 연산자를 이용한다. "의" 정도로 읽자.