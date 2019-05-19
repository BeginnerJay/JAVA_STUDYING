package chapter07;
// 배열이라는 형식 자체가 하나의 타입이므로, 타입 뒤쪽에 [] 괄호를 붙이는 것이 논리적으로 맞는 선언 방법
// 첨자로부터 배열 요소를 찾는 연산은 실행 중에 수행되므로, 정수 리터럴뿐만 아니라 변수도 사용할 수 있다.
// 배열 크기를 직접 쓰지 않고 length 속성으로 조사하도록 해야 크기가 바뀌어도 루프를 수정할 필요가 없다.
public class ScoreArray {
    public static void main(String[] args) {
        int[] score = new int[5];
        score[0] = 88;
        score[1] = 99;
        score[2] = 70;
        score[3] = 55;
        score[4] = 100;

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + "번 학생의 성적" + score[i]);
        }
    }
}
