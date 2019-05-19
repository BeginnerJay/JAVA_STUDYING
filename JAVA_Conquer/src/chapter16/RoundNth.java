package chapter16;
// pow를 이용하면 10의 승수를 쉽게 구할 수 있음 -> 이 메서드로 반올림할 자리 선택해주자.
public class RoundNth {
	
	public static double roundNtn(double value, int n) {
		double multi = Math.pow(10, n);
		return Math.round(value * multi)/multi;
	}
}
