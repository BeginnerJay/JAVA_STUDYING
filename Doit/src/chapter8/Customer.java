package chapter8;
// 하위 클래스가 생성되는 과정
// 상속을 받은 하위 클래스는 상위 클래스의 변수와 메서드를 사용할 수 있다.
// 즉 CustomerTest 예제에서는, VIPCustomer 클래스로 선언한 customerKim 인스턴스는
// 상속받은 상위 클래스의 변수를 자기 것처럼 사용할 수 있다.
// 변수를 사용할 수 있다는 것은 그 변수를 저장하고 있는 메모리가 존재한다는 뜻이다.
// 그런데 VIPCustomer 클래스에서는 해당 변수 선언 할당 한 적 없는데?!!?
public class Customer {
    // 총 5개의 멤버 변수
    // 하위 클래스에서 사용할 수 있도록 protected로 변경해주자.

    /*
    private int customerID;
    private String customerName;
    private String customerGrade;
    */
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    // 외부 변수에서 customerID, customerName, customerGrade 변수를 사용하기 위해 getter, setter 추가

    // Customer 클래스를 생성할 때 고객 ID와 이름을 반드시 지정해야 한다면?
    // setter로 값을 지정하지 말고, 새로운 생성자를 만들어 parameter로써 값을 전달해야 한다.

    public Customer() {
        initCustomer(); // 고객 등급과 보너스 포인트 적립을 지정할 함수를 호출
    }

    public Customer(int customerID, String customerName) {
        /*
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        */
        initCustomer();
        this.customerName = customerName;
        this.customerID = customerID;
        System.out.println("Customer() constructor 호출");
    }

    private void initCustomer() { // 생성자에서만 호출하는 메서드 -> private
        customerGrade = "SILVER";
        bonusRatio = 0.01; // 멤버 변수들 초기화
    }


    /*
    public Customer() { // Default Constructor
        customerGrade = "SILVER"; // 기본 등급
        bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
        System.out.println("Customer() constructor 호출"); // superclass 생성시 콘솔 출력문
    }
    */

    public int calcPrice(int price) { // 보너스 포인트 적립, 지불 가격 계산 메서드
        bonusPoint += price * bonusRatio; // 보너스 포인트 계산
        return price;
    }

    public String getCustomerInfo() { // 고객 정보를 반환하는 메서드
        return getCustomerName() + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public String getCustomerName() {
        return customerName;
    }
}
