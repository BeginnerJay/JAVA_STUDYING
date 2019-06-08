package chapter24;

import java.util.stream.Collectors;

public class CollectorTest {
    public static void main(String[] args) {
        String names = Data.nara.stream()
                .map(Country::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
// collecor 메서드는 모든 요소를 문자열 하나로 조립하여 리턴한다.