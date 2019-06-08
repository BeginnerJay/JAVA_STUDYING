package chapter24;

import java.util.Arrays;
import java.util.stream.Stream;

/*
요소를 이미 배열로 가지고 있다면, Arrays.stream 메서드로 스트림을 생성하며,
범위를 지정하여 일부만 스트림으로 바꿀 수도 있다.
 */
public class ArrayStream {
    public static void main(String[] args) {
        String[] ar = {"한국", "중국", "일본"};
        Stream<String> stringStream = Arrays.stream(ar);
        stringStream.forEach(System.out::print);
    }
}
