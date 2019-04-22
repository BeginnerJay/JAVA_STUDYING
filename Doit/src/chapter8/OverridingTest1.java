package chapter8;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerKim = new Customer(10010, "김재욱");
        customerKim.bonusPoint = 1000;

        VIPCustomer_Inherited customerCho = new VIPCustomer_Inherited(10020, "조성우", 12345);
        customerCho.bonusPoint = 10000;

        int price = 10000;
        System.out.printf("%s님이 지불해야 하는 금액은 %d원입니다.",
                customerKim.getCustomerName(),
                customerKim.calcPrice(price));
        System.out.printf("%s님이 지불해야 하는 금액은 %d원입니다.",
                customerCho.getCustomerName(),
                customerCho.calcPrice(price));
    }
}
