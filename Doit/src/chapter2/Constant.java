package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0; // 사용하기 전에 초기화해주지 않으면 오류 발생

		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		// MAX_NUM = 1000; <- 에러(상수는 이렇게 값 바꿀 수 없음)
	}
}

