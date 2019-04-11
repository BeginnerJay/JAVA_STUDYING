package chapter3;
// 단락 회로 평가 실습하기
public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10, i = 2;
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		// 논리 곱에서 앞 항의 결과값이 이미 거짓이므로 뒷 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// 앞 항이 거짓이라 뒷 항이 실행되지 않아 i값은 그대로!

		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		// 논리 곱에서 앞 항의 결과값이 이미 참이므로 뒷 문장은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// 앞 항이 참이라 뒷 항이 실행되지 않아 i값은 그대로!
	}

}
