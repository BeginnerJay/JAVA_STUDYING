package chapter8;
// 배열로 고객 5명 구현하기
// VIP, GOLD 모두 Customer에서 상속받은 클래스 -> Customer형으로 선언한다.
    // 이렇게 선언하면 이 배열에서 Customer, GOLD, VIP 모두 구현 가능하다.
    // 그리고 이 배열에 Customer의 subclass가 추가되면 모두 Customer로 upCasting된다(implicitly)

import java.util.ArrayList;

public class CustomerTest3 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerKim = new Customer(10010, "김재욱");
        Customer customerCho = new Customer(10020, "조성우");
        Customer customerChon = new GoldCustomer(10030, "천민석");
        Customer customerJH = new GoldCustomer(10040, "김지혁");
        Customer customerKing = new VIPCustomer_Inherited(10030, "구매왕", 13123313);

        // ArrayList의 add속성을 사용해 객체 배열에 고객 추가
        customerList.add(customerKim);
        customerList.add(customerCho);
        customerList.add(customerChon);
        customerList.add(customerJH);
        customerList.add(customerKing);

        System.out.println("===========고객 정보 출력===========");
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerInfo());
        }

        System.out.println("===========할인율과 보너스 포인트 계산===========");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.printf("%s님이 %d원 지불하셨습니다\n",
                    customer.getCustomerName(),
                    cost);
            System.out.printf("%s님의 현재 보너스 포인트는 %d점입니다.\n",
                    customer.getCustomerName(),
                    customer.bonusPoint);
        }
    }
}
// 고객 정보를 출력하는 getCustomerInfo() 메서드는 Override하지 않음 -> Customer 클래스에 있는 메서드 호출
// 고객 등급에 따라 할인율, 적립금 다름 -> calcPrice() 메서드는 각 클래스에 재정의