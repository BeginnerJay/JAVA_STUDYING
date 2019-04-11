package chapter4;

public class Even99 {

	public static void main(String[] args) {
		int dan, times;
		for (dan = 2;  dan < 10; dan++) {
			if (dan%2 !=0) {
				continue;
			}
			for (times = 1; times < 10; times++) {
				System.out.printf("%d * %d = %d ", dan, times, dan*times);
			}
			System.out.println("\n");
		}

	}

}
