package chapter05;
// break�� ���� ��ü�� ������ �����ϴµ� ����
// continue�� ������ ���� �ݺ� �ϳ��� �����ϰ� ���� �ݺ��� ����Ѵ�.
public class Continue {
	public static void main(String[] args) {

        int[] score = { 88, 94, -1, 79, 23 };

        for (int i = 0; i < 5; i++){

            if (score[i] == -1) continue;

            System.out.println((i + 1) + "�� �л��� ���� : " + score[i]);

        }

   }
}
// continue ��ɵ� ��ø�� ������ ���η� ���ư� �� �ڿ� ���̺��� ���� �� ������
// break���� ���� �� Ȱ���� ���� �幰��.