package chapter23;

public class FuncInterface3 {
    public static void main(String[] args) {
        FindMax fm = (a, b) -> a > b ? a:b;
        System.out.println("result = " + fm.max(3, 7));
        GetTime gt = () -> System.currentTimeMillis();
        System.out.println("result = " + gt.systemtime());
    }
}


interface GetTime {
    long systemtime();
}