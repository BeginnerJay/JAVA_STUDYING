package chapter19;
// 서브메서드보다 상위에서 예외를 처리할 수도 있다.
public class StackTrace2 {
    public static void main(String[] args) {
        method();
    }

    static void method() {
        try {
            submethod();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void submethod() {
        int i;
        int a = 3, b = 0;
        i = a / b;
        System.out.println(i);
    }
}
