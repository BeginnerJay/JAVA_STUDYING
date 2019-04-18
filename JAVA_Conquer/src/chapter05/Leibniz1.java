package chapter05;

/*
 * ���亸�ٴ� ������ Ǫ�� ������ ������ �Ѵ�.
 */

public class Leibniz1 {
	public static void main(String[] args) {
		double pie = 0;
		boolean plus = true;
		for (int deno = 1; deno < 1000; deno +=2) {
			if (plus == true) {
				pie = pie + 1.0/deno;
				plus = false;
			} else {
				pie = pie - 1.0/deno;
				plus = true;
			}
		}
		pie *= 4;
		System.out.println("pie = " + pie);
		// ������ ���ǹ����� �����ϴ� ���� ��ȿ����!
		pie = 0; int sign = 1;
		for (int deno = 1; deno < 1000; deno+=2) {
			pie = pie + (1.0/deno)*sign;
			sign = -sign;
		}
		pie *=4;
		System.out.println("pie = " + pie);
		
		pie = 0;
		for (int deno = 1; deno < 1000; deno+=4) {
			pie = pie + (1.0/deno - 1.0/(deno + 2));
		}
		System.out.println("pie = " + pie*4);
	}
}
