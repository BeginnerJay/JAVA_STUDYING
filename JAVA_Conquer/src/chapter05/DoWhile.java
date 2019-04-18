package chapter05;
/*
 * ���ǿ� ������� �ϴ� �Էº��� �޾ƾ� �ϹǷ� 
 * while������ do while���� �����ϴ�. 
 * while������ �ۼ��Ѵٸ� ���� �Էµ� ���� ���� ���¿��� 
 * ���� ���ϹǷ� �������� ���� �ȵȴ�. 
 * ���� ���� �� ���� ������ ���� ��� ���θ� �Ǵ��� �� �ִ�.
 */
public class DoWhile {
	public static void main(String[] args) {

        java.util.Scanner scaner = new java.util.Scanner(System.in);

        int num;

        int sum = 0;

        do {

            System.out.print("���ڸ� �Է��ϼ���(���� �� 0) : ");

            num = scaner.nextInt();

            sum = sum + num;

        } while (num != 0);

        System.out.println("�� �հ� = " + sum);

        scaner.close();

   }
}
