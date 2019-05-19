package chapter03;

public class Constant {
	public static void main(ClassString[] args) {
		final double RATE = 3.28;
		// �ʱ�� �������ָ� ����
		System.out.println("������ : " + RATE + "%");
		int deposit = 10000;
		System.out.println("1�� �� ���� : " + 
				deposit * RATE / 100 + "��");
	}
}
/* ����� ����
 * 1. �Ǽ� ���� EX) ������ �߸� ��� �������
 * 2. ���� �ǹ� ���� ǥ��
 * 3. �� ���� ����
 * */