package chapter19;

public class ExMessage {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 0;
        try {
            c= a / b;
            System.out.println("c = " + c);
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
            // 예외가 발생한 원인을 문자열로 반환한다.
        }
        System.out.println("프로그램 실행 완료");
    }
}
