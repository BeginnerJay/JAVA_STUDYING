
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
			System.out.println("0으로 나누기 예외 발생");
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자가 배열 범위를 넘었습니다.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 실행 완료");

	}

}
