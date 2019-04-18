package chapter07;

public class NewArray {
    public static void main(String[] args) {
        // 간편한 초기화
        int[] score = {88,99,70,55,100};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + ", ");
        }
        System.out.println();

        // 다시 초기화
        // 모든 요소의 값 바꾸기 가능, 배열 크기 바꾸기 가능
        // 배열 요소 타입이나 차원은 바꿀 수 없음.
        score = new int[] {1,2,3,4,5,6,7,8}; // 배열을 교체할 때에는 new 연산자 필요
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + ", ");
        }
    }
}
// 메서드 간에 배열을 전달할 때에는 기존 배열을 넘기거나, 인수열에서 새로운 배열을 만든다