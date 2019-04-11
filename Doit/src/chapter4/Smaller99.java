package chapter4;

public class Smaller99 {

	public static void main(String[] args) {
		int dan, times;
		for (dan = 2;  dan < 10; dan++) {
			for (times = 1; times < 10; times++) {
				if (times > dan) {
					break;
				}
				System.out.printf("%d * %d = %d ", dan, times, dan*times);
			}
			System.out.println("\n");
		}

	}

}
