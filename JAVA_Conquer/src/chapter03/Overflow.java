package chapter03;

public class Overflow {

	public static void main(ClassString[] args) {
		// 128�� 1����Ʈ�� ǥ���� �� ���� -> �����÷�. ���� ǥ�õ� �ȶ��
		byte value = 127;
		value++;
		System.out.println(value);
		int biggerValue = 1234567890;
		biggerValue = biggerValue * 2;
		System.out.println(biggerValue);
		// � �ڷ����̵� ���� �� ���� ����
	}

}
