package chapter3;

public class Constant {
	public static void main(ClassString[] args) {
		final double RATE = 3.28;
		// 초기식 안적어주면 에러
		System.out.println("이자율 : " + RATE + "%");
		int deposit = 10000;
		System.out.println("1년 후 이자 : " + 
				deposit * RATE / 100 + "원");
	}
}
/* 상수의 장점
 * 1. 실수 방지 EX) 이자율 잘못 적어서 금융사고
 * 2. 값의 의미 쉽게 표현
 * 3. 값 편집 용이
 * */