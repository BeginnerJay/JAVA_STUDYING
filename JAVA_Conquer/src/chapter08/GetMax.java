package chapter08;
// 메서드는 변수와 달리 Signature로 구분한다.(메서드의 이름 & 인수의 타입 목록)
// 메서드는 인수 목록으로도 구분 가능 -> 같은 이름으로 인수가 다르면 여러 개의 메서드 정의 가능.
public class GetMax {
    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMax(3,5));
    }
}
