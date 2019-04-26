package chapter10;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999; // 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨.

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num);
    // 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨.

    // 디폴트 메서드
        // 인터페이스에서 구현하지만, 이후 인터페이스를 구현한 클래스가 생성되면 그 클래스에서 사용할 기본 기능.
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod(); // 디폴트 메서드에서 private 메서드 호출
    }
    // 정적 메서드는 static 예약어를 사용하여 선언, 클래스 생성과 무관하게 사용 가능.
    static int total(int[] arr) {
        int total = 0;

        for(int i : arr) {
            total += i;
        }
        myStaticMethod(); // 정적 메서드에서 private static 메서드 호출
        return total;
    }

    // private 메서드는 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없다.
        // 코드를 모두 구현해야 하므로 추상 메서드에는 사용할 수 없지만, static 예약어와는 같이 사용할 수 있다.

    private void myMethod() {
        System.out.println("private 메서드입니다.");
    }

    private static void myStaticMethod() {
        System.out.println("private static 메서드입니다.");
    }
}
