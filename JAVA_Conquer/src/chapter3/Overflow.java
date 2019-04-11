package chapter3;

public class Overflow {

	public static void main(ClassString[] args) {
		// 128은 1바이트로 표현할 수 없다 -> 오버플로. 에러 표시도 안뜬다
		byte value = 127;
		value++;
		System.out.println(value);
		int biggerValue = 1234567890;
		biggerValue = biggerValue * 2;
		System.out.println(biggerValue);
		// 어떤 자료형이든 피할 수 없는 문제
	}

}
