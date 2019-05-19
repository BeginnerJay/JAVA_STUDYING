package chapter15;
// Integer와 Long에 정의되어 있는 toBinaryString 정적 메서드는 기본형 값을 이진수로 출력한다.
// 실수는 이진수로 바로 출력할 수 없어, Integer나 Long으로 바꾼 후 출력한다.

public class BinaryString {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1234));
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(0.1f)));
    }
}
