package chapter16;
// 피타고라스 빗변 구하기
public class Hypot {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double c = Math.hypot(x, y);
		// double c = Math.sqrt(x * x + y * y);
		System.out.println("빗변 = " + c);
	}
}
