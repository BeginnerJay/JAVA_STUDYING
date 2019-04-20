package chapter12;

class DeliveryTest {
    public static void main(String[] args) {
        DeliveryMan kang = new DeliveryMan();
        // 각 탈것마다 이동하는 방법은 다형적으로 조금씩 다르지만, 타고 다닌다는 점에서는 기능적으로 호환된다.
        kang.delivery(new Bike(), "짜장면");
        kang.delivery(new AutoBike(), "pizza");
        kang.delivery(new SkyKongKong(), "hamburger");
    }
}
// 1. 부모 타입의 변수는 자식 객체를 가리킬 수 있다.
// 2. 객체로 호출 가능한 메서드 종류는 객체의 선언 타입을 따른다.
// 3. 메서드를 호출하면 선언 타입이 아닌 객체의 타입을 따른다.

// 이런 문법을 제대로 활용하기 위해 추상화, 캡슐화를 통해 클래스를 모델링하고, 상속을 통해 클래스 계층을 구성한다.