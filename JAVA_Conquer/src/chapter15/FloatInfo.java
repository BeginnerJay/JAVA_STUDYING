package chapter15;

public class FloatInfo {
    public static void main(String[] args) {
        System.out.printf("Float의 크기 = %d, 지수 최소값 = %d, 지수 최대값 = %d\n",
                Float.SIZE, Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("Double의 크기 = %d, 지수 최소값 = %d, 지수 최대값 = %d\n",
                Double.SIZE, Double.MIN_EXPONENT, Double.MAX_EXPONENT);
    }
}
