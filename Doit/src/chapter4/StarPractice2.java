package chapter4;

public class StarPractice2 {

	public static void main(String[] args) {
		int lineCount = 5;
		for (int i = 1; i < lineCount; i++) {
			// i가 0부터 시작하면 첫째 줄 별이 안찍힘
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
