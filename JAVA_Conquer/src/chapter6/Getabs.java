package chapter6;

public class Getabs {

	public static void main(String[] args) {
		int value = -5;
		// 절대값 구하기( 중간 변수 abs 선언할 필요 없이)
		System.out.println("절대값 = " + (value>0? value: -value));

	}

}
