package chapter19;
// ArthimeticException이나 ArrayIndexOutOfBoundsException이나 둘 다 RuntimeException 후손
// 두 예외를 하나의 catch 블록으로 처리해도 상관없음(정확도는 떨어짐)
public class PolyEx {
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
        catch (java.lang.RuntimeException  e) {
            System.out.println("실행중 예외 발생");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
