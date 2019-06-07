package chapter23;
/*
함수형 인터페이스나 함수 설명자의 이름은 예시에 불과하다.
중요한 것은 test가 T를 받아 boolean을 return한다는 것이다.

 */

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.printf("result = %d", add.apply(3,7));
    }
}
