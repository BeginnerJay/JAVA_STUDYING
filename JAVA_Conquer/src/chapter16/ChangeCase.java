package chapter16;
/*
 * String toLowerCase()
 * String toUpperCase()
 * String trim() <- 모든 공백 제거
 * String concat(String str) <- 문자열 연결
 * String replace(char oldChar, char newChar) <- 문자열 내의 모든 oldChar를 newChar로 바꾼다.
 * String replace(CharSequence target, CharSequence replacement) <- 부분 문자열을 찾아 다른 문자열로 치환
 * String replaceFirst(String regex, String replacement) <- 처음 검색되는 부분 문자열 치환
 * String replaceAll(String regex, Sring replacement) <- 부분 문자열 모두 찾아 치환.
 * 검색 문자열은 정규 표현식이다.
 * 문자열 자체를 직접 변경하는 것이 아니라, 변경된 새로운 문자열을 return 한다.
 */
public class ChangeCase {
	public static void main(String[] args) {
		String str = "Kim Sang Hyung";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// 문자열 자체를 변경하는 것은 아니다.
		str.toUpperCase();
		System.out.println(str);
		
		// 문자열을 변경하려면 다시 대입받아야 한다.
		str = str.toUpperCase(); 
		System.out.println(str);
	}
}
