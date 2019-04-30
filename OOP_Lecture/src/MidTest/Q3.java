package MidTest;

public class Q3 {
    public static void main(String[] args) {
        int x = 8, n = 4;
        int res;

        res = (int)(8*Math.pow(2,4));
        System.out.println(res);

        res = (int)(8/Math.pow(2,4));
        System.out.println(res);

        res = x << n;
        System.out.println(res);

        res = x >> n;
        System.out.println(res);
    }
}
