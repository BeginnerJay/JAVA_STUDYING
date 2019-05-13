// reduce() 연산은 내부적으로 스트림의 요소를 하나씩 소모하면서 프로그래머가 직접 지정한 기능을 수행.
// T reduce(T identify, BinaryOperator<T> accumulator) -> 초기값, 수행해야할 기능이 parameter
// BinaryOperator<T> accumulator는 람다식 직접 써도 되고, 인터페이스 구현한 클래스를 생성해서 대입해도 됨.
// BinaryOperator<T> accumulator는 함수형 인터페이스로, apply() 메서드를 반드시 구현해야 한다.
// apply()는 2개의 parameter와 1개의 return을 가지는데, 세 개 모두 같은 자료형이다.
// reduce()가 호출될 때 BinaryOperator<T> accumulator의 apply()메서드가 호출된다.

// 내부적으로는 반복문이 호출되면서, 람다식에 해당하는 부분이 리스트 요소만큼 호출되는 것이다.

package chapter13;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello", "Good Morning", "반갑습니다^^"};
        // reduce() 메서드 내에 직접 람다식을 구현하는 경우
        System.out.println(Arrays.stream(greetings).reduce("",(s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        }));
        // 인터페이스를 구현한 클래스를 만들고, reduce()에 parameter로 전달하는 경우
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
