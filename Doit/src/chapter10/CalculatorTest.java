package chapter10;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        System.out.println(calc.square(num1));
        calc.showInfo();
        calc.description();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));

        // 디폴트 인터페이스는 인터페이스에 이미 구현되어 있으므로, 인터페이스를 구현한 추상 클래스 Calculator나
        // 추상 클래스를 상속받은 CompleteCalc 클래스에서 코드를 구현할 필요가 없다.
    }
}
