package chapter04;
/*
 * switch���� ���� ������ ������ ���� ���̾ 
 * �ַ� �������� ����Ѵ�. 
 * �Ǽ����� ��Ȯ�� ��� �񱳰� ��ư� ����Ȯ�ؼ� ����� �� ������
 * long���� �� ������ ���� ����� �����Ѵ�. 
 * ���ڿ��� ���� ��� ���������� 
 * �ڹ� 7���� ���� ������ ����� �� �ִ�.
 */
public class StringCase {
	public static void main(String[] args) {

        String country = "China";
        switch (country) {
        case "Korea":
            System.out.println("Seoul");
            break;
        case "China":
            System.out.println("Beijing");
            break;
        case "Japan":
            System.out.println("Tokyo");
            break;
        }
	}
}
/*
 * ���ڿ� Ÿ���� country �����κ��� �б��Ͽ� ���� ã�� 
 * �ش� ������ ������ ����Ѵ�. 
 * country�� China�� �ʱ�ȭ�Ǿ� �־� 
 * �߱��� ������ ����¡�� ��µȴ�. 
 * ���ڿ��� ��ҹ��ڸ� �����Ͽ� ��Ȯ�� ���ϱ� ������ 
 * ������ ���� case�� ��ҹ��� ������ ��ġ�ؾ� �Ѵ�.
 */
