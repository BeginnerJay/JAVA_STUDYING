package chapter5;

public class RandNum {
	 public static void main(String[] args) {
         java.util.Scanner scanner = new java.util.Scanner(System.in);
         int num = (int)(Math.random() * 10) + 1;
         for (;;) {
             System.out.print("숫자를 맛춰 보세요(1~10) : ");

             int input = scanner.nextInt();
             if (input == num) {
                  System.out.println("정답입니다.");
                  break;
             } else if (input > num) {
                  System.out.println(input + "보다 더 작은 숫자입니다.");
             } else {
                  System.out.println(input + "보다 더 큰 숫자입니다.");
             }
         }
         scanner.close();      
    }
}
//  바깥쪽으로 무한 루프를 한 번 더 감싸면 게임을 계속할 수 있다.

/*
 * for (;;) {

     int num = (int)(Math.random() * 10) + 1;

     for (;;) {

          숫자 입력받아서 크기 판별하고 맞출 때까지

     }

     if (한겜더하실래요? == 아니오) {

          break;

     }

}
 */
/*
 * 사용자가 언제 게임을 그만둘지 모르니 
 * 바깥쪽 루프도 반복 횟수를 미리 알 수 없으며 
 * 그래서 무한 루프를 중첩했다. 
 * 네트웍이나 외부 환경은 불확실해서 
 * 언제 원하는 조건을 만족할지 알 수 없는 경우가 많다. 
 * 이럴 때는 성공할 때까지 반복하는 무한 루프가 꼭 필요하다. 
 * 예측할 수 없는 상황이 예상보다 흔해서 자주 사용된다.
 */
