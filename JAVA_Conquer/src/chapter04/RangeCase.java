package chapter04;
/*
 * score �������� 90 ~ 100 ���̶�� ���ǹ��� 
 * �� �����ڸ� ����Ͽ� score >= 90 && score <= 100 
 * ���� �ۼ��� �� �ְ� if������ �̷� ������ ����� �� �ִ�. 
 * �׷��� case������ ����� �ϳ��� ���� �� �־� 
 * ������ ������ �� ����. �̷� ���� �ణ ������ �ؾ� �ϴµ� 
 * ���� 10���� ���� �� 10�ڸ����� �����ϸ� �ȴ�.
 */
public class RangeCase {
	public static void main(String[] args) {

        int score = 82;

        switch (score/10) {
        case 10:
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        default:
            System.out.println("F");
            break;
        }
   }
}
/*
 * �� ������ ���ٽ��� ������ ������ ���̰� ������ 
 * �⺻ ������ �� �����ϸ� �� ������ �ϵ� ������ ó���� �� �ִ�. 
 * �� ������ �������� case�� ���� ������ �����ϰ� �� Ȱ���� ���ε� 
 * �迭�̳� ������� Ȱ���ϸ� �� ª�� ���� ���� �ִ�.
 */
