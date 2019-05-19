package chapter16;
// 1에서 12까지의 정수 난수 얻기
public class Random2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random() * 12) + 1);
		}
	}
}
// 일일히 조작해서 범위 맞추기는 성가시다.
// java.util.Random을 사용해 원하는 범위의 난수 쉽게 얻을 수 있다.