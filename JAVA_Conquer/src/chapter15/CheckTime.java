package chapter15;

public class CheckTime {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + "번째 줄");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " 초 걸림");
	}
}
// 경과 시간의 단위가 1/1000초로 정밀하여, 초 단위로 바꾸기 위해 실수 1000.0으로 나누었다.