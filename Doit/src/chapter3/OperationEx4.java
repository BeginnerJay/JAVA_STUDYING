package chapter3;
// 조건 연산자를 사용하여 부모님 나이 비교하기
public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;

		char ch;
		//조건식이 참이면 결과 1, 거짓이면 결과2가 선택된다.
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
	}
}
