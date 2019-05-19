package chapter16;

public class Trim {
	public static void main(String[] args) {
		String str = "      Kim Sang Hyung    ";
		
		System.out.println(str.trim());
		System.out.println(str.trim().concat(" BABO"));
	}
}
// 다른 문자열 처리 메서드를 연쇄적으로 호출할 수 있다. 이것이 + 말고 concat 쓰는 이유.