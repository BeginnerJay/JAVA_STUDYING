package chapter24;

public class ReduceTest {
	public static void main(String[] args) {
		int total = Data.nara.stream()
				.map(Country::getPopu)
				.reduce(0, (i,j) -> i+j);
		System.out.println(total);
	}
}
/* 첫 번째 인수로 초기값을 주고 두 번째로 누적자를 준다.
초기값이 필요하지 않다면
	Optional<T> reduce(BinaryOperator<T> accumulator)
	리턴값이 T가 아니라 Optional<T>이다.
초기값이 없고 스트림이 완전히 비어 있을 때는 빈 객체 리턴
*/