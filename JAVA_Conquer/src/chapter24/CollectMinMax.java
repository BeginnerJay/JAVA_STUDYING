package chapter24;

import java.util.Optional;
import java.util.stream.Collectors;

// 내부적으로 StringBuilder를 사용하여 여러 개의 요소를 결합하더라도 성능 감소는 없다.
// 스트림의 개수, 최대, 최소값을 찾는다.
public class CollectMinMax {
    public	static void main(String[] args) {
        long num = Data.nara.stream()
                .collect(Collectors.counting());
        System.out.println(num);
        Optional<Integer> max = Data.nara.stream()
                .map(Country::getPopu)
                .collect(Collectors.maxBy(Integer::compare));
        System.out.println(max.get());
        Optional<Integer> min = Data.nara.stream()
                .map(Country::getPopu)
                .collect(Collectors.minBy(Integer::compare));
        System.out.println(min.get());
    }
}
