package chapter07;
// 기본형은 완전한 복사본이 생성되어 원본과 사본이 독립적이다.
public class CopyPrim {
    public static void main(String[] args) {
        int i = 1;
        int i2 = i;

        i2 = 1000;
        System.out.println(i);
        System.out.println(i2); // i1과 i2의 값이 다름
    }
}
