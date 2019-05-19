package chapter03;

public class Precision {
// double�� ��ȿ�ڸ� 15, float�� 7
// double�� 64��Ʈ, float�� 32��Ʈ
	public static void main(ClassString[] args)
	{
		float value = 12345.123456789f;
		System.out.println(value);
		double value2 = 12345.123456789;
		System.out.println(value2);
		double pie = 3.14159265358979323843363279502884;
		System.out.println(pie);
		
		float f = 0f;
		// ���� ������ ���̸� Ŀ����
		for (int i = 0; i < 1000000; i++) {
			f = f + 0.1f;
		}
		System.out.println(f);
	}

}
