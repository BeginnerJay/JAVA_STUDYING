package chapter24;

import java.util.stream.Stream;

public class IntStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(3,1,4,1,5);
        // 정수를 저장하는 스트림 타입은 Stream<Integer>이다.
        integerStream.forEach(System.out::println);
        // forEach는 모든 요소를 순회하며, 인수로 전달한 메서드를 호출하여 각 요소별로 임의의 처리를 수행한다.
        // of와 forEach를 한 줄에 처리할 수도 있다.
        // Stream.of(3,1,4,1,5).forEach(System.out::print);
    }
}
