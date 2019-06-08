package chapter24;

import java.util.stream.Stream;

// 규칙에 따라 스트림을 계속 생성해내는 무한 스트림에는 limit 메서드가 반드시 필요하다.
public class TwoPower {
    public static void main(String[] args) {
        Stream.iterate(2, a -> a*2)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
    }
}
