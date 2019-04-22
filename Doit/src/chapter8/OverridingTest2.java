package chapter8;

public class OverridingTest2 {
    public static void main(String[] args) {
        // VIP 고객 생성
        Customer vc = new VIPCustomer_Inherited(10030,"나몰라", 2000);
        vc.bonusPoint = 1000;

        System.out.printf("%s님이 지불해야 하는 금액은 %d원입니다.",
                vc.getCustomerName(),
                vc.calcPrice(10000));
    }
}
// 멤버 변수와 메서드는 선언한 클래스형에 따라 호출된다.
// 그러면 vc.calcPrice(10000)은 당연히 선언한 클래스형인 Customer 클래스의 calcPrice() 메서드를 호출해야겠지?
    // 그런데 출력 결과를 보니 9000원이다.
    // 재정의한 메서드가 호출되었다!

// 상속에서 상위, 하위 클래스에 같은 이름의 메서드 존재 -> 호출된느 메서드는 인스턴스에 따라 결정된다(동적 바인딩)
