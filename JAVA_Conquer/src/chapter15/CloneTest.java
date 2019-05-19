package chapter15;

public class CloneTest {
    public static void main(String[] args) {
        int[] ar = { 1,2,3,4,5};
        int[] ar2 = ar.clone();
        // 전혀 독립적인 사본(같은 주소 바라보는 사본 말고)만들 때에는 clone 메서드를 사용.
        ar2[0] = 1000;

        System.out.println("ar[0] : " + ar[0]);
        System.out.println("ar2[0] : " + ar2[0]);
    }
}
