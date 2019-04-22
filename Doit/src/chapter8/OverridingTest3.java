package chapter8;
// 클래스형에 기반하여 지불 금액 계산하기
public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;
        // Customer 클래스로 인스턴스 생성
        Customer customerKim = new Customer(10010, "김재욱");
        // VIPCustomer 클래스로 인스턴스 생성
        VIPCustomer_Inherited customerCho = new VIPCustomer_Inherited(10020, "조성우", 12345);
        // VIPCustomer 클래스로 인스턴스를 생성하여 Customer 클래스로 형변환한 경우
        Customer customerChon = new VIPCustomer_Inherited(10030, "천민석", 65498);


        System.out.printf("%s님이 지불해야 하는 금액은 %d원입니다.",
                customerKim.getCustomerName(),
                customerKim.calcPrice(price));
        System.out.printf("%s님이 지불해야 하는 금액은 %d원입니다.",
                customerCho.getCustomerName(),
                customerCho.calcPrice(price));
        System.out.printf("%s님이 지불해야 하는 금액은 %d원입니다.",
                customerChon.getCustomerName(),
                customerChon.calcPrice(price));
    }
}
