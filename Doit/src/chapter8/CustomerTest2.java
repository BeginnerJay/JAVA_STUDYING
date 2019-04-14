package chapter8;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer_Inherited customerChon = new VIPCustomer_Inherited(10030, "천민석",13123313);
        /*
        customerChon.setCustomerID(10030);
        customerChon.setCustomerName("천민석");
        */
        customerChon.bonusPoint = 50000;

        System.out.println(customerChon.getCustomerInfo());
    }
}
// 상위 클래스를 상속받은 하위 클래스가 생성될 때에는 반드시 상위 클래스의 생성자가 먼저 호출된다.
// 그리고 상위 클래스 생성자가 호출될 때에, 상위 클래스의 멤버 변수가 메모리에 생성된다.

// 부모를 부르는 예약어 super
    // 하위 클래스는 상위 클래스의 주소, 즉 참조값을 알고 있다.
    // 이 참조값을 갖고 있는 예약어가 super이다.
    // this가 자기 자신의 참조 값을 가지고 있는 것과 같다.
    // 또한 super는 상위 클래스의 생성자를 호출하는 데에도 사용된다.