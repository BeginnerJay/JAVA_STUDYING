package chapter24;

import java.util.stream.Stream;

/*
static<T> Stream<T> iterate(T seed, UnaryOperator<T> f) // 일련의 숫자 갖는 스트림 생성
시작값과 입력값을 받아, 다음 값을 생성하는 함수 전달
 */
public class Iterate {
    public static void main(String[] args) {
        Stream.iterate(1, a -> a+1).limit(50000).forEach(s -> System.out.println(s));
    }
}
