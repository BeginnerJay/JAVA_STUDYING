package MidTest;

public class Q3Test {
    public static void main(String[] args) {
        Q2 player1 = new Q2();
        Q2 player2 = new Q2();

        int num1 = player1.getRNum();
        int num2 = player2.getRNum();

        System.out.printf("player1 : %s\n", rock_paper_scissors(num1));
        System.out.printf("player2 : %s\n", rock_paper_scissors(num2));

        int res = whowinner(num1, num2);

        switch (res) {
            case 1:
                System.out.println("The game ended in a tie");
                break;
            case 2:
                System.out.println("The winner is the player1");
                break;
            case 3:
                System.out.println("The winner is the player2");

        }
    }

    static int whowinner(int num1, int num2) {
        int res;
        if (num1 == num2) {
            res = 1;
        } else if ((num1 == 1 && num2 == 3) || (num1 == 2 && num2 ==1) || (num1 == 3 && num2 == 2)) {
            res = 2;
        } else {
            res = 3;
        }
        return res;
    }

    static String rock_paper_scissors(int num) {
        if (num == 1) {
            return "scissors";
        } else if (num == 2) {
            return "rock";
        } else {
            return "paper";
        }
    }
}
