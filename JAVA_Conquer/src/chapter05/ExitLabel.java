package chapter05;

public class ExitLabel {
	public static void main(String[] args) {

        dan:

        for (int i = 1; i <= 9; i++) {

            for (int j = 1;j <= 9;j++) {

                 if (i == 2 && j == 3) break dan;

                 System.out.println(i + " * " + j + " = " + i * j);
// ���� 2�� 3�࿡�� ��� �۾��� �����Ϸ��� �ٱ� �������� �� Ż�� �ʿ�
// -> Ż���ϰ��� �ϴ� ������ ���̺�� �̸��� ���̰�,
// break ������ Ż���� ���̺� �̸��� �����Ѵ�.
            }

            System.out.println("");

        }

   }
}
// 2�� 3�࿡�� ��� ó���� ��� �����ȴ�.
// Java ������ ���̺�� ���� ������ Ż���ϴ� ��� ����
// ��ø Ƚ���� ������� �ս��� Ż���� �� �ִ�.