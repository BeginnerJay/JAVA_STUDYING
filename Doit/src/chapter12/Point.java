package chapter12;
// 자료형 매개변수가 두 개 이상인 경우도 있다.
//반환형 앞에 사용하는 <자료형 매개변수>는 여러 개일 수 있으며, 이는 메서드 내에서만 유효하다.
public class Point<T, V> {
    T x;
    V y;

    public Point(T x, V y) {
        // 한 점을 나타내는 Point 클래스의 두 좌표는 정수일 수도 실수일 수도 있다 -> T,V로 표현.
        this.x = x;
        this.y = y;
    }

    // 제네릭 메서드
    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
