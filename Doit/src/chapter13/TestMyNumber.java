package chapter13;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이스형 max 변수에 대입
        System.out.println(max.getMax(10, 20)); // 인터페이스형 변수로 메서드 호출
    }
}
// 자바에서는 참조 변수 없이 메서드를 호출할 수 없다.
// 그러므로 람다식을 구현하기 위해 함수형 인터페이스를 만들고
// 인터페이스에 람다식으로 구현할 메서드를 선언하는 것.

// 하나의 함수형 인터페이스가 두 개 이상의 메서드를 가져서는 안 된다. 어떤 메서드를 구현한 것인지 모호해지기 때문.