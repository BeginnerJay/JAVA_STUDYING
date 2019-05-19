package chapter16;

public class StringConstructor {
	public static void main(String[] args) {
		String str = new String("아름다운"); // new 연산자로 생성자 호출
		System.out.println(str);

		String str2 = "우리나라";
		System.out.println(str2);
		
		char[] ar = { 'k', 'o', 'r', 'e', 'a' };
		// char 배열을 모아 문자열로 초기화하기
		String str3 = new String(ar);
		System.out.println(str3);
		
		System.out.println("대한민국".length());
	}
}
