package chapter8;
// 8.1.1 서브루틴
// 혼자서 모든 것을 다 처리하면 중복이 발생해 효율이 떨어진다.
public class Samecode {

	public static void main(String[] args) {
		int sum;
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10 = " + sum);
		
		sum = 0;
		for (int i = 15; i < 100; i++) {
			sum +=i;
		}
		System.out.println("15 ~ 100 = " + sum);
	}
}
// 합계를 구하는 작업을 별도의 코드 덩어리로 분리하는 것이 좋다.
// 자바 컴파일러는 메서드 목록을 먼저 파악한 후 컴파일하므로 선언 순서는 상관없다.
// 변수는 사용하기 전에 선언되어 있어야 하지만 메서드는 그렇지 않다.