package chapter8;
// 새로운 고객 등급 추가하기
public class GoldCustomer extends Customer{
    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override // 재정의한 메서드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
// 상속을 사용하면 새로운 기능이 추가되더라도 쉽게 구현할 수 있다.