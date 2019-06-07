package chapter23;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRef2 {
    public static void main(String[] args) {
        // 인스턴스 메서드
        Function<String, String> upper = String::toUpperCase;
        // String 클래스의 toUpperCase 메서드의 레퍼런스를 정의하여 호출했다.
        // s -> s.toUpperCase()와 같다.
        System.out.println(upper.apply("korea"));

        // 객체의 인스턴스 메서드
        Consumer<String> print = System.out::println;
        print.accept("korea");
    }
}