package chapter16;
// 참조형 변수는 사본이 원본과 같은 대상을 가리킬 때 사본을 변경하면 원본도 같이 변경된다.
// 문자열은 참조형 변수지만 예외적으로 동작한다.
public class StrAssign {
	public static void main(String[] args) {
		String s = "korea";
		String s2 = s;
		
		s2 += " fighting";
		
		System.out.println("s = " + s);
		System.out.println("s2 = " + s2);
	}
}
