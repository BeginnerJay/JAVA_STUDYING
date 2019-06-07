package chapter23;

import java.util.function.IntPredicate;

/*
조건을 판별하는 Predicate는, 조건을 결합하는 and, or 메서드와, 결과를 반대로 뒤집는 negate를 제공한다.
이미 만들어진 조건식을 논리적으로 결합하여, 더 복잡한 조건을 점검하는 람다식을 만든다.
 */
public class NegateTest {
    public static void main(String[] args) {
        IntPredicate isEven = n -> n%2 == 0;
        IntPredicate over10 = n -> n > 10;

        IntPredicate isOdd = isEven.negate();
        IntPredicate evenAndOver10 = isEven.and(over10);
        IntPredicate evenOrOver10 = isEven.or(over10);

        System.out.println("7은 홀수인가 : " + isOdd.test(7));
        System.out.println("12는 10보다 큰 짝수인가 : " + evenAndOver10.test(12));
        System.out.println("8은 10보다 큰 짝수인가 : " + evenAndOver10.test(8));
        System.out.println("15는 10보다 크거나 짝수인가 : " + evenOrOver10.test(15));
    }
}
