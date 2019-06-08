package chapter24;

import java.util.stream.IntStream;

public class RangeClosed {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }
}
// 1에서 100까지 정수 스트림을 만들어 준 후, sum만 해주면 된다.