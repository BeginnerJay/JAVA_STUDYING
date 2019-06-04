package chapter19;

public class MultiCatch {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 2;
        int[] ar= {1,2,3,4,5};

        try {
            c= a / b;
            System.out.println("c = " + c);
            ar[5] = 100;
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("첨자가 배열 범위를 넘어섰습니다.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
// 예외 스스로 제공하는 설명 문자열이 정확하다.