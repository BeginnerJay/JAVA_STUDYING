package chapter23;

public class CountAge2 {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("30세 = " + count(30));
        System.out.println("31세 = " + count(31));
    }

    static int count(int age) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] == age) num++;
        }
        return num;
    }
}
