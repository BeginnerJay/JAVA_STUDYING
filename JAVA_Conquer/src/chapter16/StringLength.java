package chapter16;

public class StringLength {
	public static void main(String[] args) {
		String str = "아름다운 우리나라";
		System.out.println("길이 : " + str.length());
		System.out.println("2번째 문자 : " + str.charAt(2));
		// charAt()은 index 위치의 문자 하나를 조사한다.
	}
}
