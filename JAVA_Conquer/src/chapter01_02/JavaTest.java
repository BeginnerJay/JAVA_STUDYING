package chapter01_02;
// �ڹ��� �⺻ ����� ����� System Ŭ������ ���� �����Ǹ�, �Է¿��� in ��ü�� ��¿��� out ��ü�� �̸� �����Ǿ� �ִ�.
public class JavaTest {

	public static void main(String[] args) {
		// ���ͷ��� ����, ������ ���� ���� ����, �ѱ۷� ����� ���� �մ�.
		// print�� println�� ��� �Ŀ� �ڵ����� ������ ���ִ��� ���θ� �ٸ���.
		System.out.println("One");
		System.out.println("Two");
		System.out.print("Three");
		System.out.print("Four\n");
		/*
		 * �⺻ ��¹� println()�� ������ ���� �״�� ����ϹǷ�
		 * ���� ��ȯ���� �ʰ�� �ٸ� �������� ����� �� ����.
		 * �ݸ鿡 printf()�� �����ڸ� ���� ������ ���� 
		 * ���� ���� �������� ��ȯ�Ͽ� ����� �� �ִ�.
		 */
		int i = 123;
		double d = 3.14;
		String str = "���ڿ�";
		System.out.println("i=" +i+ ", d=" +d+ ", str=" +str);
		System.out.printf("i=%d, d=%f, str=%s",i,d,str);
	}
}
