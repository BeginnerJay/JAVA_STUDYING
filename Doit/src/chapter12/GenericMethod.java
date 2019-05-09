package chapter12;

public class GenericMethod {
    // 제네릭 클래스가 아니더라도 내부에 제네릭 메서드를 구현할 수 있다.
    public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) { // 제네릭 메서드
    // makeRectangle() 메서드에서 사용한 T는 메서드 내에서만 유효하다.
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        // Number 클래스는 추상 클래스로서, Byte, Integer 등의 클래스의 superclass이다.

        // xxxValue() 함수 : 함수를 호출하는 Number객체의 값을, 함수에서 반환된 primitive data type으로 변환하는 기능
        // p1.getx()가 primitive type이 아닌 reference type이어서 쓰는 것. 원시 자료형으로 초기화되었다면 사용할 수 없다.
        // 그래서 Integer type에는 가능하지만 int type에는 불가능하다.
        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {
        // Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        // var p1 = new Point<Integer, Double>(0, 0.0);
        var p1 = new Point<>(0, 0.0);
        // Point<Integer, Double> p2 = new Point<>(10, 10.0);
        var p2 = new Point<>(10, 10.0);

        // 사용할 자료형으로 Integer와 Double을 대입하여 메서드를 호출한다.
        // 만약 사용할 자료형을 명시하지 않고 메서드를 호출하면, 컴파일러가 매개변수 클래스에서 자료형을 추론한다.
        // p1, p2가 Point<Integer, Double>형으로 선언된 경우
            // 제네릭 메서드에 대입할 자료형이 생략되어도 컴파일러에 의해 <Integer, Double>로 유추된다.
        // double rect = GenericMethod.<Integer,Double>makeRectangle(p1, p2);
        double rect = GenericMethod.makeRectangle(p1, p2);
        System.out.printf("두 점으로 만들어진 사각형의 넓이는 %.1f입니다.", rect);
    }
}
