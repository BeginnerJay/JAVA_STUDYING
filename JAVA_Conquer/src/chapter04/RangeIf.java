package chapter04;
/*
 * switch���� �ִ� ������ ������ �Ǽ��� ���� �� ���ٴ� ���̴�.
 * �Ǽ��� ��� �񱳰� ����Ȯ�ϰ� ������ ���ؾ� �ϹǷ� 
 * if else���� ����ϴ� ���� �ٶ����ϴ�.
 */
public class RangeIf {
	public static void main(String[] args) {

        double richter = 6.5;

        if (richter < 3.5) {
            System.out.println("���� �� ���ų� ���ذ� ���� ����");
        } else if (richter < 4.8) {
            System.out.println("������ ��鸮�ų� ����� ���ظ� ������.");
        } else if (richter < 6.1) {
            System.out.println("���� ������ �ν��� �ǹ����� ���ظ� ������.");
        } else if (richter < 7.5) {
            System.out.println("�ݰ� 160Km ������ �ǹ��� �ı��Ѵ�.");
        } else if (richter < 8.9) {
            System.out.println("���� ������ �ɰ��� ���ظ� ������.");
        } else {
            System.out.println("��õ Km ������ ����ȭ��Ų��.");
        }
   }
}
