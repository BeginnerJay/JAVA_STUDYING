package chapter16;
// 내용이 아닌 참조만 점검하는 == 연산자로는 정확히 비교할 수 없다.
// 문자열의 내용을 비교할 때에는 연산자 대신 메서드를 사용한다.
// IgnoreCase가 붙은 메서드는 대소문자를 구분하지 않는다.
/*
 * boolean equals(Object anObject)
 * boolean equalsIgnoreCase(String anotherString)
 * int compareTo(String anotherString)
 * int compareToIgnoreCase(String str)
 */
public class StrCompare {
	public static void main(String[] args) {
		String str1 = "KOREA";
		String str2 = "korea";
		
		System.out.println(str1.equals(str2) ? "같다":"다르다");
		System.out.println(str1.equalsIgnoreCase(str2) ? "같다":"다르다");
		
		String apple = "Apple";
		String orange = "Orange";
		int Result = apple.compareTo(orange);
		if (Result == 0) {
			System.out.println("같다");
		} else if (Result < 0) {
			System.out.println("Apple이 더 앞쪽");
		} else if (Result > 0) {
			System.out.println("Apple이 더 뒤쪽");
		}
	}
}
