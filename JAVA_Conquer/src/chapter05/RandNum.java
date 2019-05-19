package chapter05;

public class RandNum {
	 public static void main(String[] args) {
         java.util.Scanner scanner = new java.util.Scanner(System.in);
         int num = (int)(Math.random() * 10) + 1;
         for (;;) {
             System.out.print("���ڸ� ���� ������(1~10) : ");

             int input = scanner.nextInt();
             if (input == num) {
                  System.out.println("�����Դϴ�.");
                  break;
             } else if (input > num) {
                  System.out.println(input + "���� �� ���� �����Դϴ�.");
             } else {
                  System.out.println(input + "���� �� ū �����Դϴ�.");
             }
         }
         scanner.close();      
    }
}
//  �ٱ������� ���� ������ �� �� �� ���θ� ������ ����� �� �ִ�.

/*
 * for (;;) {

     int num = (int)(Math.random() * 10) + 1;

     for (;;) {

          ���� �Է¹޾Ƽ� ũ�� �Ǻ��ϰ� ���� ������

     }

     if (�Ѱ״��ϽǷ���? == �ƴϿ�) {

          break;

     }

}
 */
/*
 * ����ڰ� ���� ������ �׸����� �𸣴� 
 * �ٱ��� ������ �ݺ� Ƚ���� �̸� �� �� ������ 
 * �׷��� ���� ������ ��ø�ߴ�. 
 * ��Ʈ���̳� �ܺ� ȯ���� ��Ȯ���ؼ� 
 * ���� ���ϴ� ������ �������� �� �� ���� ��찡 ����. 
 * �̷� ���� ������ ������ �ݺ��ϴ� ���� ������ �� �ʿ��ϴ�. 
 * ������ �� ���� ��Ȳ�� ���󺸴� ���ؼ� ���� ���ȴ�.
 */
