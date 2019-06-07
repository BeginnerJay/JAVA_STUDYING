package chapter23;

public class OperatorArgument {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(1));
        System.out.println("under = " + count(2));
    }

    static int count(int op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            switch (op) {
                case 0:
                    if (arAge[i] == 30) num++;
                    break;
                case 1:
                    if (arAge[i] > 30) num++;
                    break;
                case 2:
                    if (arAge[i] < 30) num++;
                    break;
            }
        }
        return num;
    }
}
