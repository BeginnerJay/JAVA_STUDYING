package chapter5;

public class Triangle {
	public static void main(String[] args) {
        
		for (int i = 1; i <= 10; i++) {
            for (int j = 0;j < i;j++) {
                 System.out.print('*');
            }
             System.out.println();
        }
/*
 * 매 i 루프에 대해 공백 루프는 
 * 9부터 시작해서 0까지 점점 감소하는데 
 * i가 1일 때 9회, 2일 때 8회, 3일 때 7이 되는 식이다. 
 * 여기서 행번호 i와 공백 개수는 다음 함수로 정의된다.
 *
 * 공백의 개수 = 10 - i
 * 이 개수를 공백 루프의 끝범위로 사용한다.
 */
        for (int i = 1; i <= 10; i++) {
            for (int j = 0;j < 10 - i;j++) {
                 System.out.print(' ');
            }

            for (int j = 0;j < i;j++) {
                 System.out.print('*');
            }
            System.out.println();
        }
/*
 * i가 1 ~ 10까지 변하면서 10 - i 개 만큼 공백을 찍고 
 * i개의 별을 찍기를 10번 반복하면 역삼각형 모양이 나온다. 
 * 문제는 해결했는데 공백과 별을 나누어 생각하다 보니 
 * 안쪽에 루프가 두 개라는 점이 번잡스럽다. 
 * 하나의 루프로 합치려면 j의 진행값에 따라 
 * 공백 또는 별을 출력하도록 조건문을 사용하면 된다.
 */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1;j <= 10;j++) {
                 if (j > 10 - i) {
                	 System.out.print('*');
                 } else {
                	 System.out.print(' ');
                 }
            }
            System.out.println();
        }   
// 이 코드를 더 압축하면 다음과 같이 짧아진다.   
        for (int i = 1; i <= 10; i++) {
            for (int j = 1;j <= 10;j++) {
                 System.out.print(j > 10-i ? '*':' ');
// if 조건문 대신 삼항 조건 연산자로 출력할 문자를 판단한다.
            }
            System.out.println();
        }
// 극단적인 압축(discouraged)	
        for (int i = 1; i <= 10; System.out.println(), i++)
            for (int j = 1;j <= 10;System.out.print(j > 10-i ? '*':' '), j++);
// 증감식이 매 루프마다 한 번씩 실행된다는 점을 응용한 것인데 
// 과거 C 프로그래머들이 이런 압축 코드를 작성하곤 했었다.
        for (int i = 1; i <= 10; i++) {

            for (int j = 0;j < 10 - i;j++) {

                 System.out.print(' ');

            }

            for (int j = 0;j < i * 2 - 1;j++) {

                 System.out.print('*');

            }

            System.out.println();

        }
	
	
	}
}

