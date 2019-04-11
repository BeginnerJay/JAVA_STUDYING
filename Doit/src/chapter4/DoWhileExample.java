package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		do {
			sum += num;
			num++;
		} while (num <= 10); // while 뒤에 ; 붙여야 동작함
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}
