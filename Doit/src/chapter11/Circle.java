package chapter11;
// 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언
// Cloneable 인터페이스를 선언해도 별도로 구현해야 하는 메서드는 없다.
    // 이렇게 구현할 메서드가 없는 인터페이스를 marker interface라고 한다.
public class Circle implements Cloneable {
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }

    @Override
    public String toString() {
        return "원점은 "+point+"이고, 반지름은" + radius+" 입니다.";
    }

    @Override
    // clone() 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
    // clone() 메서드만 재정의하고 Cloneable 인터페이스를 명시하지 않으면
        // clone()메서드 호출시 CloneNotSupportedException 발생
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
