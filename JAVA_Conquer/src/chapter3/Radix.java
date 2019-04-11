package chapter3;

public class Radix {

	public static void main(ClassString[] args) {
		int a = 10; //10진수
		int b = 0x10; // 0x로 시작하면 16진수
		int c = 015; // 0으로 시작하면 8진수
		int d = 0b1001; // 0b로 시작하면 2진수
		
		// println()은 별다른 지시가 없는 한 10진수로 출력된다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
