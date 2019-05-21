package lecture0507;
public class test05 {

	public static void main(String[] args) {
		int a,b,c;
		a=2;
		b=5;
		int[] arr= {1,2,3,4,5};
		try {
			c=a/0;
			System.out.println("c="+c);
			arr[5]=100;
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻�");
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("÷�ڰ� �迭 ������ �Ѿ����ϴ�.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("���α׷� ���� �Ϸ�");

	}

}
