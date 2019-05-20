package chapter18;

public class BoundTypeTest {
	public static void main(String[] args) {
		int result = BoundType.max(1, 2);
		// 원래는 int result = BoundType.<Integer>max(1, 2); 라고 해야 함.
		// 수치형만 비교하는 > 연산자 대신, 객체에 대해서도 쓸 수있는 compareTo 메서드를 쓴다.
		System.out.println(result);
	}
}
// 비교할 방법이 없는 메서드라도 Comparable<T>를 구현하면 가능하다.