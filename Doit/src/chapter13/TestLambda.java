package chapter13;
// 람다식을 변수에 대입하면 이를 매개변수로 전달할 수 있다.

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        // 람다식을 인터페이스형 변수에 대입하고, 그 변수를 사용해 람다식 구현부 호출
        lambdaStr.showString("hello lamda_1");
        showMyString(lambdaStr); // 메서드의 매개변수로 람다식을 대입할 변수 전달

        PrintString reStr = returnString(); // 변수로 반환받기
        reStr.showString("Hello "); // 메서드 호출
    }

    static PrintString returnString() {
        return s -> System.out.println(s + "world");
    }

    public static void showMyString(PrintString lambdaStr) { // 매개변수를 인터페이스형으로 받음
        lambdaStr.showString("Hello lambda_2");
    }
}
