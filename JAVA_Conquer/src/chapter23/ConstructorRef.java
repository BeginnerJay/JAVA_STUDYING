package chapter23;

import java.util.function.BiFunction;

// 생성자도 메서드 레퍼런스로 표기할 수 있따.
// 클래스명::new 형식을 사용하며, 생성자의 시그니처에 맞는 함수형 레퍼런스로 받는다.
public class ConstructorRef {
    public static void main(String[] args) {
        // 생성자 레퍼런스를 통해 객체를 생성한다.
        BiFunction<Integer, String, Human> creator = Human::new;
        // Human의 생성자는 정수형, 문자열을 받아 Human 객체를 리턴 -> BiFunction 타입으로 받는다
        Human kim = creator.apply(21, "김상형");
        System.out.println(kim.age + "세 " + kim.name);
    }
}
