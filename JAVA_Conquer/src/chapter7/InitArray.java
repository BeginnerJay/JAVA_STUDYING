package chapter7;
// 배열 요소도 사용하기 전에 원하는 값으로 초기화하여야 한다.
// 기본값은 0, false, NULL이다.
public class InitArray {
    public static void main(String[] args) {
        int[] score = new int[] {88, 99, 70, 55, 100}; // 원칙대로 선언
        // 초기식이 아닌 곳에서 배열을 생성할 때에는 반드시 new 연산자로 할당해야 한다.
        // 보통 선언과 초기화를 한번에 하는 것이 편하다.
        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + "번 학생의 성적" + score[i]);
        }
    }
}
