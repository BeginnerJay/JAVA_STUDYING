package chapter15;

public class AutoBox {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = new Integer(4);
        int c = a + b;
        System.out.println(c);

        Integer d = new Integer(12);
        d++;
        System.out.println(d);
    }
}
// 래퍼 클래스는 값을 증갑시킬 수 없지만, 자동 박싱에 의해 이것이 가능한 것처럼 보이기도 한다.