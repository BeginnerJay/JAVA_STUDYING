package chapter08;

public class OutChars {
    // 출력할 대상을 인수로 받으면 임의의 문자를 출력할 수 있다.
    static void outChars(String  ch, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            outChars("♡", 10-i);
            outChars("♥", i);
            System.out.println();
        }
    }
}
// 인수가 많으면 메서드의 활용성이 증가한다.