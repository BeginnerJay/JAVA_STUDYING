package chapter05;

public class Triangle {
	public static void main(String[] args) {
        
		for (int i = 1; i <= 10; i++) {
            for (int j = 0;j < i;j++) {
                 System.out.print('*');
            }
             System.out.println();
        }
/*
 * �� i ������ ���� ���� ������ 
 * 9���� �����ؼ� 0���� ���� �����ϴµ� 
 * i�� 1�� �� 9ȸ, 2�� �� 8ȸ, 3�� �� 7�� �Ǵ� ���̴�. 
 * ���⼭ ���ȣ i�� ���� ������ ���� �Լ��� ���ǵȴ�.
 *
 * ������ ���� = 10 - i
 * �� ������ ���� ������ �������� ����Ѵ�.
 */
        for (int i = 1; i <= 10; i++) {
            for (int j = 0;j < 10 - i;j++) {
                 System.out.print(' ');
            }

            for (int j = 0;j < i;j++) {
                 System.out.print('*');
            }
            System.out.println();
        }
/*
 * i�� 1 ~ 10���� ���ϸ鼭 10 - i �� ��ŭ ������ ��� 
 * i���� ���� ��⸦ 10�� �ݺ��ϸ� ���ﰢ�� ����� ���´�. 
 * ������ �ذ��ߴµ� ����� ���� ������ �����ϴ� ���� 
 * ���ʿ� ������ �� ����� ���� ���⽺����. 
 * �ϳ��� ������ ��ġ���� j�� ���ప�� ���� 
 * ���� �Ǵ� ���� ����ϵ��� ���ǹ��� ����ϸ� �ȴ�.
 */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1;j <= 10;j++) {
                 if (j > 10 - i) {
                	 System.out.print('*');
                 } else {
                	 System.out.print(' ');
                 }
            }
            System.out.println();
        }   
// �� �ڵ带 �� �����ϸ� ������ ���� ª������.   
        for (int i = 1; i <= 10; i++) {
            for (int j = 1;j <= 10;j++) {
                 System.out.print(j > 10-i ? '*':' ');
// if ���ǹ� ��� ���� ���� �����ڷ� ����� ���ڸ� �Ǵ��Ѵ�.
            }
            System.out.println();
        }
// �ش����� ����(discouraged)	
        for (int i = 1; i <= 10; System.out.println(), i++)
            for (int j = 1;j <= 10;System.out.print(j > 10-i ? '*':' '), j++);
// �������� �� �������� �� ���� ����ȴٴ� ���� ������ ���ε� 
// ���� C ���α׷��ӵ��� �̷� ���� �ڵ带 �ۼ��ϰ� �߾���.
        for (int i = 1; i <= 10; i++) {

            for (int j = 0;j < 10 - i;j++) {

                 System.out.print(' ');

            }

            for (int j = 0;j < i * 2 - 1;j++) {

                 System.out.print('*');

            }

            System.out.println();

        }
	
	
	}
}

