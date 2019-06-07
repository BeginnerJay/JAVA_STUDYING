package chapter21;

import java.io.IOException;

public class ConsolIn {
    public static void main(String[] args) {
        int name;
        System.out.println("이름을 입력한 후 Enter 누르시오");
        System.out.println("Ctrl + Z to Terminate");
        for ( ; ; ) {
            try {
                name = System.in.read();
                if (name == -1)
                    break;
                System.out.printf("%c", (char)name);
            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Input Error");
            }
        }
        System.out.println("입력 완료");
    }
}
// in 객체는 기본적으로 바이트 스트림을 읽기 때문에, 한글은 입력받지 못한다.
// 문자 스트림을 입력받으려면 InputStreamReader 클래스를 사용한다.