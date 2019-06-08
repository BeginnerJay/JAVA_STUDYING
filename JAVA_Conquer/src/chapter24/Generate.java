package chapter24;

import java.util.stream.Stream;

// static <T> Stream<T> generate(Supplier<T> s)
// T 타입을 리턴하는 Supplier<T> 타입의 함수를 주면, 그 리턴값으로 스트림을 채운다.
public class Generate {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(5000000).forEach(s -> System.out.println(s));
    }
}
