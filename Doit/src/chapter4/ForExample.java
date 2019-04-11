package chapter4;

public class ForExample {

	public static void main(String[] args) {
		int i, sum;
		for (i = 0, sum = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
