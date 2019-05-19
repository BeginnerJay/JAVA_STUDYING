package chapter15;

public class PrintfFormat {
    public static void main(String[] args) {
        int i = 123;
        double d = 3.14159265;
        System.out.printf("__%d__\n", i);
        System.out.printf("__%5d__\n", i);
        System.out.printf("__%-5d__\n", i);
        System.out.printf("__%05d__\n", i);
        System.out.printf("__%6.2f__\n", d);
        System.out.printf("__%8.4f__\n", d);
    }
}
