package chapter07;
// for each문으로 2차 배열을 읽을 수도 있다.
// 중첩 루프를 구성하여 부분 배열을 먼저 읽고, 부분 배열을 순회하며 점수값을 읽어야 한다.
public class ForEach2 {
    public static void main(String[] args) {
        int[][] score = new int[][]{
                {77,56,70,82},
                {99,96,89,88},
                {81,69,62,80}
        };

        for (int[] student : score) {
            for (int subject : student) {
                System.out.print(subject + ", ");
            }
            System.out.println();
        }
    }
}
