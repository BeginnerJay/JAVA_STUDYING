package chapter18;
// T는 임의의 클래스여서 적용 범위가 너무 광범위하다.
// 그래서 메서드의 본체 코드가 특정한 타입이나 그 subType만을 대상으로 한다면 타입 인수 제한 필요.
// <T extends upper> 형식으로 제한한다.
// upper가 인터페이스인 경우라도 바운드 타입을 지정할 때에는 implements 대신 extends 쓴다.
public class BoundType {
	// max 메서드의 타입 인수로 T는 반드시 Comparable<T>를 구현한 타입이어야 한다.
	static <T extends Comparable<T>> T max(T a, T b) {
		if (a.compareTo(b) > 0) {
			return a;
		} else {
			return b;
		}
	}
}
