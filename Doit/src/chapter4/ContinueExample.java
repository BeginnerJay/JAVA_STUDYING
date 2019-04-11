package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0, max = 100, num;
		for (num = 1; num <= max; num++) { // 100까지 반복
			if (num%2 == 0) { // num값이 짝수인 경우
				continue; // 이후 수행을 생략하고  num++ 수행
			}
			total += num;
		}
		System.out.printf("1부터 100까지 홀수의 합은 %d입니다.", total);
	}

}
