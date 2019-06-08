package chapter24;

import java.util.Comparator;

// 비교 대상만 전달하면 Comparator 객체를 리턴하는 정적 메서드
// static Comparator<T> comparing(Function <T,U> keyExtractor)
public class Comparing {
    public static void main(String[] args) {
        Data.nara.stream()
                .sorted(Comparator.comparing(Country::getPopu))
                .forEach(System.out::println);
    }
}
