package chapter15;
// 서식 사이에 인수 첨자를 n$ 형식으로 지정하면, 특정 인수와 대응된다.
// 뒷쪽의 인수가 꼭 순서대로 나오지 않아도, 첨자로 대응할 인수를 지정할 수 있다.
// 한 인수를 문자열 내에서 여러 번 사용하고 싶을 때 실용적이다.
public class PrintfIndex {
    public static void main(String[] args) {
        int i = 123;
        double d = 3.14;
        String str = "문자열";

        System.out.printf("i = %3$d, d = %2$f, str = %1$s\n", str, d, i);
        System.out.printf("정수 = %1$d, i = %1$d", i);
    }
}
