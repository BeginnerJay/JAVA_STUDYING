package chapter16;
// 소수점 이하 4번째 자리에서 반올림하는 법
public class Round {
	public static void main(String[] args) {
		double value = 123.456789;
		
		double value1000 = value * 1000;
		double valueround = Math.round(value1000);
		double value3 = valueround / 1000.0;
		
		System.out.println(value3);
	}
}
