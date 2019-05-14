package chapter15;
// read(byte[] b)로 바이트 배열 크기만큼 한번에 읽기 -> 속도가 훨씬 빨라짐

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("input2.txt")) {
            var bs = new byte[10];
            int i;
            while ((i=fileInputStream.read(bs)) != -1) {
                /*
                for (byte b : bs) {
                    System.out.println((char)b);
                    // 이렇게 하면 10개씩 한번에 읽어져서, 마지막에 버퍼 문제로 읽었던 값 또 읽게 된다.
                }
                 */
                for (int k = 0; k < i; k++) {
                    System.out.println((char)bs[k]);
                }
                System.out.printf(" : %d 바이트 읽음", i);
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }
    }
}
// JavaDoc 등에서 메서드를 찾아 사용할 때에는, 매개변수 뿐 아니라 반환값의 의미도 잘 확인할 것!