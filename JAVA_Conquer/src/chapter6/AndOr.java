package chapter6;

public class AndOr {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;
		// 논리 and 가 논리 or 보다 우선하므로 답이 직관과 반대로 나온다.
		if (a == 1 || b == 2 && c == 10 || d == 10) {
			System.out.println("진실");
		} else {
			System.out.println("거짓");
		}
	}

}
