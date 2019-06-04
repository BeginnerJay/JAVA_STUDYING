package chapter19;
// 예외 발생 시의 호출 스택 상태를 출력
public class StackTrace {
    public static void main(String[] args) {
        method();
    }

    static void method() {
        submethod();
    }

    static void submethod() {
        int i;
        int a = 3, b = 0;
        try {
            i = a / b;
            System.out.println(i);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
// submethod에서 예외가 발생했을 때 어떤 예외가 발생했는지와 이 메서드가 호출된 모든 경로 출력