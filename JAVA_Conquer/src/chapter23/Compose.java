package chapter23;

import java.util.function.Function;

/*
Function, Operator 같은 인터페이스는 두 개의 람다식을 호출하는 디폴트 메서드를 정의한다.
andThen 메서드는, 호출 객체의 람다식을 먼저 실행하고,
    그 리턴값을 after로 전달하여 after의 리턴값을 최종 반환한다.
    앞 리턴을 뒷 입력으로 전달하여, 두 개의 람다식을 연속으로 호출한다.
compose 메서드는 인수로 주어진 before 람다식을 먼저 실행하고
    그 리턴값을 호출 객체의 입력으로 전달하여 전체적 결과를 리턴한다.
 */
public class Compose {
    public static void main(String[] args) {
        Function<String, Integer> engToNum = e -> {
            if (e.equals("one")) return 1;
            return 0;
        };

        Function<Integer, String> numToHan = n -> {
            if (n == 1) return "하나";
            return "영";
        };

        // 두 개의 람다를 순서대로 호출하기
        String eng = "one";
        int num = engToNum.apply(eng);
        String han = numToHan.apply(num);
        System.out.println(han);

        // 연속으로 호출하기
        Function<String, String> engToHan = engToNum.andThen(numToHan);
        System.out.println(engToHan.apply("one"));

        // 연속으로 호출하기(위에 거랑 순서만 다름)
        Function<String, String> engToHan2 = numToHan.compose(engToNum);
        System.out.println(engToHan2.apply("one"));
    }
}
