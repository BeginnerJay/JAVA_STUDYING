package chapter05;
/*
 * ������ ���� ������ ���� �ݺ� Ƚ���� �̸� �������� ���� ���������� 
 * ���ǽ��� �����ϸ� ���� ������ �Ǿ� 
 * ������ ���ð� ���� ������ ��� �ݺ��Ѵ�. 
 * �ʱ��, �������� �־ ��������� 
 * ���� ������ �ʿ� ���� ���� ���� �����Ѵ�.
 */

/*
 * ���� ������ ��Ȯ�� ���Ǵ� 
 * �ݺ� Ƚ���� �̸� �������� ���� �������� �����̴�. 
 * ���� ���ο��� Ż���� ���� break ����� ����ϸ� 
 * ���� ���·� ���� ������ �ۼ��Ѵ�.
 * �������� ������ ���� �Ǿ� ������ Ż���ؾ� �Ѵ�.
 */
public class Infinite {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int grade;

        for (;;) {
            System.out.print("�� �г��Դϱ�?(1~6) : ");
            grade = scanner.nextInt();
            if (grade >= 1 && grade <= 6) break;
            System.out.println("�ٽ� �Է��Ͻÿ�.");
        }
        System.out.println(grade + "�г��Դϴ�.");
        scanner.close();      
   }
}
