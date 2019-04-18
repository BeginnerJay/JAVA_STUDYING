package chapter07;

public class SumArray2 {
    public static void main(String[] args) {
        int[][] score = {
                {77,56,70,82},
                {99,96,89,88},
                {81,69,62,80}
        };
        int classsum = 0;
        for (int student = 0; student < score.length; student++) {
            int sum = 0;
            for (int subject = 0; subject < score[student].length; subject++){
                sum += score[student][subject];
            }
            System.out.println(sum);
            System.out.println(sum/score[student].length);

        }
        System.out.println((float)classsum/(score.length * score[0].length));
    }
}
