package chapter10;
// 상수 필드라고 해서 모든 객체가 다 같은 값을 가지는 것은 아니다.
    // 그래서 클래스 선언문에 명시적으로 초기화하지 않았으며, 생성자에서 개별 객체마다 초기화한다.
    // 즉 한번 정해지면 바꿀 수는 없지만, 인스턴스별로 다른 값을 가질 수는 있다.
public class LaptopTest {
    public static void main(String[] args) {
        Laptop Sens = new Laptop("Intel Core i7", 4, 500);
        Sens.printSpec();
        Sens.upgrade(8,750);
        Sens.printSpec();

        Laptop gram = new Laptop("AMD Ryzen", 8,320);
        gram.printSpec();
    }
}
