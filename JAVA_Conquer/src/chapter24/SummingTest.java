package chapter24;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

// 합계, 평균, 최대, 최소값을 한 번에 구한다.

public class SummingTest {
    public	static void main(String[] args) {
        IntSummaryStatistics summary = Data.nara.stream()
                .collect(Collectors.summarizingInt(Country::getPopu));
        System.out.println(summary);
    }
}
