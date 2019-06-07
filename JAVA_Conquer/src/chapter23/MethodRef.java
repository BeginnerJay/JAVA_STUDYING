package chapter23;
// 메서드 레퍼런스는 메서드를 값으로 정의하여, 메서드 자체를 인수로 전달하는 기법이다.

import java.util.function.*;

public class MethodRef {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(MethodRef::isAgeOver));
        System.out.println("over = " + count(i -> MethodRef.isAgeOver(i)));
        System.out.println("under = " + count(MethodRef::isAgeUnder));
        System.out.println("under = " + count(i -> MethodRef.isAgeUnder(i)));
    }

    static boolean isAgeOver(int age) {
        return (age > 30);
    }

    static boolean isAgeUnder(int age) {
        return (age < 30);
    }

    static int count(Predicate<Integer> op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.test(arAge[i])) num++;
        }
        return num;
    }
}
/*
호출할 메서드를 알려 주는 것이지 직접 호출하는 것은 아니어서 ()는 붙이지 않는다.
C의 함수 포인터와 유사하다.
 */