package chapter23;

public class CountAge {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("30세 = " + count30());
        System.out.println("31세 = " + count31());
    }

    static int count30() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] == 30) num++;
        }
        return num;
    }

    static int count31() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] == 31) num++;
        }
        return num;
    }
}
