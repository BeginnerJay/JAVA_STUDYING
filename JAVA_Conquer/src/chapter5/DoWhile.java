package chapter5;
/*
 * 조건에 상관없이 일단 입력부터 받아야 하므로 
 * while문보다 do while문이 적합하다. 
 * while문으로 작성한다면 아직 입력도 받지 않은 상태에서 
 * 값을 평가하므로 논리적으로 말이 안된다. 
 * 덮어 놓고 한 번은 실행해 봐야 계속 여부를 판단할 수 있다.
 */
public class DoWhile {
	public static void main(String[] args) {

        java.util.Scanner scaner = new java.util.Scanner(System.in);

        int num;

        int sum = 0;

        do {

            System.out.print("숫자를 입력하세요(끝낼 때 0) : ");

            num = scaner.nextInt();

            sum = sum + num;

        } while (num != 0);

        System.out.println("총 합계 = " + sum);

        scaner.close();

   }
}
