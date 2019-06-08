package chapter24;

import java.util.stream.Collectors;
// 정수형으로 맵핑하지 않고도 정수값을 추출하여 합계를 바로 구할 수 있다.
public class ReduceSum {
    public	static void main(String[] args) {
        int sum = Data.nara.stream()
                .collect(Collectors.reducing(0, Country::getPopu, Integer::sum));
        System.out.println(sum);
    }
}
