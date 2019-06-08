package chapter24;

import java.util.stream.Collectors;

public class CollectAverage {
    public static void main(String[] args) {
        int sum = Data.nara.stream()
                .collect(Collectors.summingInt(Country::getPopu));
        System.out.println(sum);
        double avg = Data.nara.stream()
                .collect(Collectors.averagingInt(Country::getPopu));
        System.out.println(avg);
    }
}
