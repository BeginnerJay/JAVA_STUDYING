package chapter5;

public class Over100 {
	public static void main(String[] args) {

        int sum = 0;

        int i;

        for (i = 1; i < 100; i++) {

             sum = sum + i;

            if (sum > 100) break;

        }
        System.out.println("합계가 100이 넘는 시점은 " + i + "입니다.");
   }
}
/*
 *합계를 구하는 것이 목적이 아니라 
 *조건에 맞는 값을 찾는 것이 목적이어서 
 *루프를 탈출할 때 제어 변수의 값을 읽어야 한다.
 *루프 바깥에서 탈출 시점의 i 값을 읽어야 하므로 
 *i 는 루프 내부에 선언해서는 안되며 외부에 별도로 선언해야 한다. 
 *for (int i =1; 로 선언문을 안쪽으로 옮기면 
 *루프 외부에서 i값을 읽을 수 없다는 에러가 발생한다. 
 */