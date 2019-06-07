package chapter23;

import java.util.function.Predicate;

public class PredicateTest2 {
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
Predicate 인터페이스가 제네릭으로 선언되어 있는 이유는
다양한 타입의 인수에 대해 사용하기 위해서이다.
 */