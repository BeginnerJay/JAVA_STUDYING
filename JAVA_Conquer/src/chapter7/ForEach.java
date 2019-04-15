package chapter7;
// 배열의 전체 길이만큼 자동 순회하니 길이에 신경쓸 필요가 없고, 번거롭게 score[i] 첨자식을 쓸 필요도 없다.
// 제어 변수 s 값만 읽으면 된다.
// 첨자나 배열 길이를 숨기고 배열 요소값인 s만 꺼내 놓안 것이다.
// s는 지역 변수이므로 블록 밖으로는 나가지 않는다.
public class ForEach {
    public static void main(String[] args) {
        int[] score = new int[] {88,94,72,75,23};
        int sum = 0;
        for(int s: score) {
            sum += s;
        }
        System.out.println(sum);
        System.out.println((float)sum/score.length);
    }
}
