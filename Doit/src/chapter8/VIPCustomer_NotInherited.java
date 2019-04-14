package chapter8;
// 상속하지 않고 VIPCustomer_NotInherited 클래스를 따로 만드는 경우
public class VIPCustomer_NotInherited {
    // Customer 변수와 겹치는 멤버 변수
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;
    // VIP 고객 관련 식능을 구현할 때만 필요한 멤버 변수
    private int agentID; // VIP 고객 담당 상담원 아이디
    double saleRatio; // 할인율

    public VIPCustomer_NotInherited() {
        customerGrade = "VIP";
        bonusRatio = 0.05; // 보너스 적립 5%
        saleRatio = 0.1; // 할인율 10%
    }

    public int getAgentID() { // VIP 고객에게만 필요한 메서드
        return agentID;
    }

    public int calcPrice(int price) { // 보너스 포인트 적립, 지불 가격 계산 메서드
        bonusPoint += price * bonusRatio; // 보너스 포인트 계산
        return price;
    }

    public String getCustomerInfo() { // 고객 정보를 반환하는 메서드
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
