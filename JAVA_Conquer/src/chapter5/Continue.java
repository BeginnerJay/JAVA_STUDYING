package chapter5;
// break는 루프 자체를 완전히 종료하는데 비해
// continue는 루프의 현재 반복 하나만 종료하고 다음 반복을 계속한다.
public class Continue {
	public static void main(String[] args) {

        int[] score = { 88, 94, -1, 79, 23 };

        for (int i = 0; i < 5; i++){

            if (score[i] == -1) continue;

            System.out.println((i + 1) + "번 학생의 성적 : " + score[i]);

        }

   }
}
// continue 명령도 중첩된 루프의 선두로 돌아갈 때 뒤에 레이블을 붙일 수 있지만
// break문에 비해 그 활용은 극히 드물다.