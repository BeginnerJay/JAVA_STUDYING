package chapter5;

public class ExitLabel {
	public static void main(String[] args) {

        dan:

        for (int i = 1; i <= 9; i++) {

            for (int j = 1;j <= 9;j++) {

                 if (i == 2 && j == 3) break dan;

                 System.out.println(i + " * " + j + " = " + i * j);
// 만약 2단 3행에서 모든 작업을 중지하려면 바깥 루프까지 다 탈출 필요
// -> 탈출하고자 하는 루프에 레이블로 이름을 붙이고,
// break 다음에 탈출할 레이블 이름을 지정한다.
            }

            System.out.println("");

        }

   }
}
// 2단 3행에서 모든 처리가 즉시 중지된다.
// Java 에서는 레이블로 다중 루프를 탈출하는 방법 제공
// 중첩 횟수에 상관없이 손쉽게 탈출할 수 있다.