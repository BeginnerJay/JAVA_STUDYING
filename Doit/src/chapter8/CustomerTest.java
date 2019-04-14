package chapter8;
// 상속 클래스 테스트하기
public class CustomerTest {
    public static void main(String[] args) {
        Customer customerCho = new Customer(10010, "조성우");
        // customerID와 customerName은 protected변수이므로 set() 메서드 호출
        /*
        customerCho.setCustomerID(10010);
        customerCho.setCustomerName("조성우");
        */
        customerCho.bonusPoint = 1000;

        System.out.println(customerCho.getCustomerInfo());

        VIPCustomer_Inherited customerKim = new VIPCustomer_Inherited(10020,"김재욱",13123313);
        // customerID와 customerName은 protected변수이므로 set() 메서드 호출
        // 그런데 왜 customerKim.coustmerID = 10020 이게 실행이 될까???
        /*
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김재욱");
        */
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.getCustomerInfo());
    }
}
// 상위 클래스로 묵시적 클래스 형 변환
    // 상속을 공부하면서 우리가 이해해야 하는 중요한 관계가 클래스 간의 형 변환이다.
        // 개념적 측면 : Customer가 VIPCustomer보다 일반적이다.
        // 기능적 측면 : Customer보다 VIPCustomer가 기능이 더 많다.
    // VIPCustomer는 VIPCustomer 자료형이면서 동시에 Customer 자료형이기도 하다.
        // 즉 VIPCustomer 클래스로 인스턴스를 생성할 때, 이 인스턴스의 자료형을 Customer형으로 형변환하여 선언 가능.
            // VIPCustomer 클래스는 Customer클래스를 상속받았기 때문이다!
    // 모든 하위 클래스는 상위 클래스 자료형으로 형변환될 수 있다. 역은 성립하지 않는다.
    // 클래스의 자료형이 상위 클래스 자료형으로 한정된 경우, 선언한 클래스형에 기반하여 멤버 변수와 메서드에 접근 가능.
        // 즉 Customer VC = new VIPCustomer();라고 인스턴스 만든 경우
            // VC 참조 변수가 가리킬 수 있는 멤버 변수와 메서드는 Customer 클래스의 멤버 및 메서드 뿐이다.
    // 클래스의 상속 게층이 여러 단계일 경우에도 상위 클래스로의 형 변환은 묵시적으로 이루어진다.