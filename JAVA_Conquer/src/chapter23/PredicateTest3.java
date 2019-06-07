package chapter23;

import java.util.function.Predicate;

public class PredicateTest3 {
    static Human[] members = {
            new Human(21, "김상형"),
            new Human(14, "김한슬"),
            new Human(21, "문한울"),
            new Human(66, "구홍녀"),
    };

    public static void main(String[] args) {
        listHuman("성인", h -> h.age >= 19);
        listHuman("김가", h -> h.name.startsWith("김"));
        listHuman("미성년 김가", h -> h.name.startsWith("김") && h.age < 19);
    }

    static void listHuman(String cap, Predicate<Human> pred) {
        System.out.print(cap + "인 사람 목록 : ");
        for (Human h : members) {
            if (pred.test(h)) {
                System.out.print(h.name + " ");
            }
        }
        System.out.println();
    }
}
/*
Predicate<Integer> 타입의 람다식은, Integer 타입의 값을 받아 boolean을 리턴한다.
이 예제는 잘 동작하지만, 제네릭의 과도한 일반화 때문에 두 가지 문제점이 있다.
    제네릭 코드가 복잡해 가독성이 떨어진다.
    정수 리터럴이 Integer 객체로 박싱되어 성능 감소가 있다.
이런 문제점을 해결하기 위해, 기본형을 받는 함수형 인터페이스가 따로 정의되어 있다.
IntPredicate, DoublePredicate, LongPredicate 등이 있다.
    제네릭 타입 T를 쓰지 않고, 기본형 타입으로 고정해 놓았다는 차이밖에 없다.
    제네릭이 없으니 읽기 편하고, 자동 박싱이 발생하지 않아 성능상 유리하다.
 */