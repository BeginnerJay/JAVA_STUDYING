package chapter23;

import java.util.function.Predicate;

public class LibInterface {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(a -> a > 30));
        System.out.println("under = " + count(a -> a < 30));

        System.out.println("29세 이상 = " + count(a -> a >= 29));
        System.out.println("30세 아닌 사람 = " + count(a -> a != 30));
        System.out.println("짝수 나이 = " + count(a -> a % 2 == 0));
        System.out.println("28~30 범위 = " + count(a -> a >= 28 && a <= 30));
    }

    static int count(Predicate<Integer> op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.test(arAge[i])) num++;
        }
        return num;
    }
}
// 미리 선언되어 있기 때문에 인터페이스를 선언할 필요 없이 필요한 코드만 람다로 작성하면 된다