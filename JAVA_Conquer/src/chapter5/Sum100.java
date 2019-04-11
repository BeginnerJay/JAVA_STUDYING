package chapter5;

public class Sum100 {
	public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++){
             sum = sum + i;
        }
        System.out.println("합계 = " + sum);
   }
}
/*
 * 비슷한 코드가 반복된다 싶으면 코드를 나열하지 말고 
 * 규칙을 찾아 반복문으로 바꾼다. 
 * 코드에서 반복되는 부분을 찾고 변화가 있는 부분에 
 * 제어 변수를 적용하여 유사한 코드를 루프로 정의하면 된다. 
 * 
 * 반복되는 부분에서 유사한 코드가 무엇이고 
 * 제어 변수를 어디에 어떻게 적용할 것인지 잘 결정해야 한다.
 */