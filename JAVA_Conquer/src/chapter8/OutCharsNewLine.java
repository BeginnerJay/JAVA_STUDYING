package chapter8;
// 이번에는 다 출력한 후 개행하는 기능까지 outChars에 통합해 보자.
// 개행이 필요한 경우가 있고 아닌 경우도 있으니, boolean인 newline 인수를 받고 이 인수가 true이면 개행한다.
public class OutCharsNewLine {
    static void outChars(String ch, int num, boolean newline) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
        if (newline) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            outChars("☆", 10-i, false);
            outChars("★", i, true);
        }
    }
}
