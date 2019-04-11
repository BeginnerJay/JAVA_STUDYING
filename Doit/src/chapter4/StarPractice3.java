package chapter4;

public class StarPractice3 {

	public static void main(String[] args) {
		int lineCount = 5;
		int spaceCount = 3;
		for (int i = 1; i < lineCount; i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			spaceCount--;
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		/* 공백 세 칸 찍고 별 하나
		 * 공백 두 칸 찍고 별 두개..
		 * 이런식으로 순수 반복문식으로 생각할수도
		 */
			
		System.out.println();
		}
		
		for(int i = 1; i < lineCount; i++){
			for(int j = 4; j > 0; j--){
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		/*네칸 중에 i보다 j가 작으면 공백 크면 별
		 * 이런 식으로 조건문을 섞어서 생각할수도 있음
		 */
	}

}
