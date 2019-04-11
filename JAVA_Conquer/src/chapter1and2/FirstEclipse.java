package chapter1and2;
/*
 * 클래스는 자바 프로그램을 구성하는 기본 단위. 최소한 하나의 클래스는 있어야 한다.
 * 자바 프로그램은 main 메서드에서 실행을 시작한다.
 * 완전한 객체지향 언어인 자바는 함수도 무조건 클랫에 포함되어 있어야 한다.
 * 그래서 main이 FirstEclipse 안에 작성되어 있으며, 클래스와 무관한 함수임을 표시하기 위해 static 지정자 붙었다.
 * 외부에서 회출되므로 public이고, return값은 없으며, 명령행에서 전달된 인수의 배열을 받아들인다.
 * */
public class FirstEclipse {

	public static void main(String[] args) {
		System.out.println("JAVA Example Program");
		System.out.println("3 * 5 = " + 3*5);

	}

}
