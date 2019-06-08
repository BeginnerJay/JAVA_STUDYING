package chapter24;
// 래퍼 클래스를 언박싱해서 읽으니 성능상 불리하다.
// 그래서 기본형에 대한 스트림이 별도로 제공한다.

public class MaptoInt {
	public static void main(String[] args) {
		int total = Data.nara.stream()
			.mapToInt(Country::getPopu)
			.sum();
		System.out.println(total);
	}
}
