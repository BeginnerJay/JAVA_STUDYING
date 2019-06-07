package chapter23;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Human kim = new Human(21, "김상형");
        Predicate<Human> isAdult = h -> h.age >= 19;
        System.out.println(isAdult.test(kim));
    }
}
/*
람다식을 함수형 인터페이스 객체에 대입할 수 있다는것은
다른 메서드의 인수로 넘길 수 있다는 것이고,
어떤 람다식을 넘기는가에 따라 동작이 달라질 수 있음을 의미한다.
 */