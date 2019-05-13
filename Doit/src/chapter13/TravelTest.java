package chapter13;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이지은", 27, 100);
        TravelCustomer customerKim = new TravelCustomer("김재욱", 21, 500);
        TravelCustomer customerCho = new TravelCustomer("조성우", 15, 900);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerCho);

        System.out.println("명단 추가된 순서대로 출력");
        // map 메서드로 고객 이름 가져오고 forEach 메서드로 이름을 출력한다.
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        // 각 고객의 지불비용을 가져와, mapToInt로 정수로 변환한 후 sum으로 합을 구한다. int 반환하므로 int에 초기화
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.printf("총 여행 비용은 %d입니다.\n", total);

        System.out.println("20세 이상 고객 명단 정렬하여 출력");
        // filter로 20세 이상만 추출한 후, map으로 이들의 이름을 가져오고, sorted를 이용해 정렬(이 셋이 중간 연산)
        // forEcah를 사용하여 모두 출력.(최종 연산. 자료가 소모된다.)
        customerList.stream().filter(c -> c.getAge() >= 20)
                .map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));

        ArrayList<TravelCustomer> customerArrayList = new ArrayList<>(); // 이 둘은 어떤 차이지?
        customerArrayList.add(customerLee);
        customerArrayList.add(customerKim);
        customerArrayList.add(customerCho);


    }
}
