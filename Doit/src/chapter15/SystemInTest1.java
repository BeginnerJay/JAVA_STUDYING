// 문자 하나를 입력받기
package chapter15;
// 표준 입출력 클래스는 프로그램이 시작될 때 생성되므로 따로 만들 필요가 없다.
import java.io.IOException;
public class SystemInTest1 {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 하나를 쓰고 enter 치세요");

        int i;
        try {
            i = System.in.read(); // read 메서드로 한 바이트 읽음
            System.out.println(i); // 아스키 코드로 나온다.
            System.out.println((char)i); // 문자로 변환하여 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// i는 4바이트지만 System.in은 바이트 단위로 읽어 들이는 InputStream이므로 1바이트만 읽습니다.