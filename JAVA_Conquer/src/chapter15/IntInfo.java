package chapter15;

public class IntInfo {
    public static void main(String[] args) {
        System.out.printf("int 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n",
                Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("short 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n",
                Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n",
                Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
