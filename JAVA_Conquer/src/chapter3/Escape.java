package chapter3;

public class Escape {
	public static void main(ClassString[] args) {
		char yen = '\u00a5';
		System.out.print(yen);
		char omega = '\u03c9';
		System.out.print(omega);
		System.out.print('\n');
		char quot = '\'';
		System.out.println(quot);
	}
}
// 특수문자 넣을때는 유니코드 값 필요