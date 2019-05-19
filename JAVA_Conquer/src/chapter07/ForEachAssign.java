package chapter07;

public class ForEachAssign {
    public static void main(String[] args) {
        int[] score = {88,94,72,75,23};
        for(int s: score) {
            s++;
        }
        System.out.println(score[0]);
    }
}
// s는 배열 요소의 사본일 뿐이어서 원본에는 영향을 주지 않는다.
// 배열의 일부만 읽거나 요소의 값을 변경하려면 for 루프로 순회하면서 배열 요소를 직접 조작해야 한다.
