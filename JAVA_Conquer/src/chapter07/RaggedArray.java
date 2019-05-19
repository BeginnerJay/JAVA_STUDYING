package chapter07;
// 들쭉날쭉한 배열 혹은 불규칙 배열
// 자바는 다차원 배열을 하나의 덩어리로 다루지 않고 배열의 배열 형태로 다룬다.
// 그래서 자바는 각 행별로 다른 크기를 가질 수 있다.
public class RaggedArray {
    public static void main(String[] args) {
        int[][] score = {
                {77,56,70,82,95,96,98,82},
                {99,96},
                {81,69,62,80,77}
        };

        for (int student = 0; student < score.length; student++) {
            System.out.print((student+1)+ "번 학생의 성적 : ");
            for (int subject = 0; subject < score[student].length; subject++) {
                System.out.print(score[student][subject] + ", ");
            }
            System.out.println();
        }
    }
}
