package chapter04;

public class Switch2 {
	public static void main(String[] args) {

        int ranking = 2;

        switch (ranking) {
        case 1:
            System.out.println("�����մϴ�. �ݸ޴��̿���.");
            break;
        case 2:
            System.out.println("���޴��� �����մϴ�.");
            break;
        case 3:
            System.out.println("���޴��Դϴ�.");
            break;
        default:
            System.out.println("�������� �帳�ϴ�.");
            break;
        }
	}
}
/*case�������� ���� ���� ����� �ۼ��� �� �־� 
 * { } ����� ������ �ʾƵ� �������. 
 * ��� case���� ���� break���� �ξ� switch���� Ż���Ѵ�. 
 * switch���� ������ �� �ϳ��� ���� ����� ���� ó���ϱ� ������ 
 * case�� ó���� �Ŀ� ��� break�Ͽ� ���� ������ ���� �������̴�.
 *  ���޴��� �����Ǿ����� �Ʒ��� case�� �� �� �ʿ� ����.
 */