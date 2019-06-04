	package chapter8;
//VIPCustomer 클래스 상속으로 구현하기
public class VIPCustomer_Inherited extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer_Inherited(int customerID, String customerName, int agentID) {
        // 원래 super();는 컴파일러가 자동으로 추가하는 코드.
        // super(); // 상위 클래스의 Customer();가 호출된다.
            // 묵시적으로 호출될 디폴트 생성자 Customer()가 정의되지 않았기 때문에,\
            // 반드시 명시적으로 다른 생성자를 호출해야 해서 오류가 떴다.
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP"; // 상위 클래스에서 private 변수이면 오류 발생한다.(외부 클래스에서 사용 불가능)
        // 그러므로 Customer 클래스에서 customerGrade 변수를 protected로 바꿔주자.
        bonusRatio = 0.05;
        saleRatio = 0.1;
        // System.out.println("VIPCustomer_Inherited() constructor 호출"); // subclass 생성시 콘솔 출력문
        System.out.println("VIPCustomer_Inherited(int, String) constructor 호출");
    }

    @Override
    public String getCustomerInfo() {
        return super.getCustomerInfo() + "담당 상담원 ID는 " + agentID + "입니다.";
        // super. 를 붙이는 것이 원칙이지만, 굳이 호출하지 않아도 잘 동작한다.
        // 하위 클래스가 상위 클래스와 동일한 이름의 메서드를 구현하는 경우도 있는데, 그럴 때는 super.가 필요하다.
        // 8-3 Method Override에서 자세히 배워보자.
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; // 보너스 포인트 적립
        return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 반환
    }
}
