package chapter07;
// 배열 요소의 자료형에는 제한이 없다.
// 문자열 실수, 객체(클래스 객체)도 가능하다. 배열도 하나의 자료형이여서 배열이 배열의 요소가 될 수 있다.
public class Rectangular {
    public static void main(String[] args) {
        int[][] score = {
                {77,56,70,82},
                {99,96,89,88},
                {81,69,62,80}
        };

        for (int student = 0; student < score.length; student++) {
            System.out.print((student + 1) + "번 학생의 성적 : ");
            for (int subject = 0; subject < score[student].length; subject++) {
                System.out.print(score[student][subject] + " ");
            }
            System.out.println();
        }
    }
}
// 가로로 돌면 학생별 성적을 읽고, 세로로 돌면 과목별 성적을 읽는다.
// 가로 세로로 이중 루프를 돌면 전체 성적을 다 읽어 총점과 평균을 구한다.