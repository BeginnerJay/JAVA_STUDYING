package chapter01_02;

public class Scanner {
	// 기본 입력 객체인 System.in은 복잡하니 Scanner 사용법부터 알아보자
	public static void main(String[] args) {
		//예제 수준에서는 main의 선두와 마지막에 각각의 구문을 작성해주면 된다.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		/*
		 * nextInt() 정수 입력
		 * nextDouble() 실수 입력
		 * nextLine() 문자열 입력
		 * nextBoolean() true, false 중 입력
		 */
		// 입력 메서드는 입력만 받을 뿐 지시 사항을 보여주지 않으므로, 입력받기 전에 print 메서드로 알려주자
		System.out.print("이름을 입력하시오 :"); //이름 입력 옆에서
		String 이름 = scanner.nextLine();
		System.out.println("안녕하세요 " +이름+ "님.");

		System.out.println("나이를 입력하시오 :"); // 나이 입력 밑에서
		int 나이 = scanner.nextInt();
		System.out.println("당신은 " +나이+ "살입니다.");
		//예제 수준에서는 main의 선두와 마지막에 각각의 구문을 작성해주면 된다.
		scanner.close();
	}

}
