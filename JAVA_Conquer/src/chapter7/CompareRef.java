package chapter7;

public class CompareRef {
    public static void main(String[] args) {
        int i = 123, i2 = 123;
        int[] ar1 = {1,2,3}, ar2 = {1,2,3};
        int[] ar3 = ar1;

        System.out.println(i==i2? "같다" : "다르다");
        System.out.println(ar1 == ar2? "같다" : "다르다"); // 다른 메모리 차지하고 있어 다르다고 출력함.
        System.out.println(ar1 == ar3? "같다" : "다르다");
    }
}
