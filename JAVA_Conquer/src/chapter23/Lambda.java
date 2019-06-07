package chapter23;
/*
자바 8 이전에는 동작을 인수로 전달하기 위해, 메서드를 객체로 감싸 전달하는 방법이 유일했다.

class AgeOver implements AgeFilter {
    public boolean isAgeOk(int age) {
        return (age > 30);
    }
}

정작 실행되는 코드는 age > 30 비교 연산식밖에 없다.
람다 표현식은 이런 불필요한 코드를 제거한다. 람다 표현식은 함수를 압축하여 값으로 표현한 것.

 */
public class Lambda {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(a -> a > 30));
        System.out.println("under = " + count(a -> a < 30));
    }

    static int count(AgeFilter ageFilter) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (ageFilter.isAgeOk(arAge[i]))
                num++;
        }
        return num;
    }
}
/*
이 람다식이 메서드를 간략하게 표기한 것이며, AgeFilter 인터페이스의 isAgeOk 메서드와 같다.
인터페이스는 람다식의 시그니처로 사용할 뿐, 그 외 용도는 없다.
흔히 사용하는 시그니처여서 java.util.function패키지에 Predicate로 이미 선언되어 있다.
 */