package chapter16;
/*
 * 생성자는 Random([long seed])
 * int nextInt()
 * int nextInt(int n) <- 0 ~ n 미만 정수 난수 리턴하는 nextInt가 가장 실용적이다.
 */
import java.util.Random;
public class NextInt {
	public static void main(String[] args) {
		Random R = new Random(13123313);
		for (int i = 0; i < 5; i++) {
			System.out.println(R.nextInt(10));
		}
	}

}
