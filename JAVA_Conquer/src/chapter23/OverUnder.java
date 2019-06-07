package chapter23;

public class OverUnder {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + countover());
        System.out.println("under = " + countunder());
    }

    static int countover() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] > 30) num++;
        }
        return num;
    }

    static int countunder() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] < 30) num++;
        }
        return num;
    }
}
