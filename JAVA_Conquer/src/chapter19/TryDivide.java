package chapter19;

public class TryDivide {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 0;
        try {
            c = a / b;
            System.out.println("c = " + c);
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
        }
        System.out.println("프로그램 실행 완료");
    }
}
