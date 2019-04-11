package chapter3;

public class Precision {
// double은 유효자리 15, float는 7
// double은 64비트, float는 32비트
	public static void main(ClassString[] args)
	{
		float value = 12345.123456789f;
		System.out.println(value);
		double value2 = 12345.123456789;
		System.out.println(value2);
		double pie = 3.14159265358979323843363279502884;
		System.out.println(pie);
		
		float f = 0f;
		// 작은 오차도 모이면 커진다
		for (int i = 0; i < 1000000; i++) {
			f = f + 0.1f;
		}
		System.out.println(f);
	}

}
