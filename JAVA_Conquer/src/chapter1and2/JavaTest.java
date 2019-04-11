package chapter1and2;
// 자바의 기본 입출력 명령은 System 클래스에 의해 제공되며, 입력용의 in 객체와 출력용의 out 객체가 미리 생성되어 있다.
public class JavaTest {

	public static void main(String[] args) {
		// 리터럴은 물론, 변수의 값을 찍을 수도, 한글로 출력할 수도 잇다.
		// print와 println은 출력 후에 자동으로 개행을 해주는지 여부만 다르다.
		System.out.println("One");
		System.out.println("Two");
		System.out.print("Three");
		System.out.print("Four\n");
		/*
		 * 기본 출력문 println()은 변수의 값을 그대로 출력하므로
		 * 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
		 * 반면에 printf()는 지시자를 통해 변수의 값을 
		 * 여러 가지 형식으로 변환하여 출력할 수 있다.
		 */
		int i = 123;
		double d = 3.14;
		String str = "문자열";
		System.out.println("i=" +i+ ", d=" +d+ ", str=" +str);
		System.out.printf("i=%d, d=%f, str=%s",i,d,str);
	}
}
