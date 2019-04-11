package chapter3;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; // 5를 8비트 2진수로 나타냄

		System.out.println(num << 2); // 왼쪽으로 2빝 이동 00010100 (20)
		System.out.println(num >> 2); // 오른쪽으로 2빝 이동 00000001 (1)
		System.out.println(num >> 2); // 오른쪽으로 2빝 이동 00000001 (1)

		System.out.println(num);
		//num에 값을 대입하지 않았으므로 비트 이동과 관계없이 기존 값 그대로 출력
		num = num << 2; // 왼쪽으로 2비트 이동한 값으로 덮어쓰기
		//직접 덮어써 주어야 num값이 바뀐다
		System.out.println(num);
	}

}
