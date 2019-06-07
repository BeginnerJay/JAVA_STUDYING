package chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문자 단위가 아닌 줄 단위 입력을 받을 때에는
InputStreamReader 클래스의 readLine 메서드를 호출한다.

 */
public class ConsolIn3 {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(r);
        try {
            String str = b.readLine();
            System.out.println(str);
            System.out.println("입력완료");
        }
        catch (IOException e) {
            System.out.println("input error");
        }
    }
}
