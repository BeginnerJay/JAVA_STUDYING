package chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일이 아주 크다면, 거대한 배열을 한 번에 할당하기 어렵다.
// 그래서 파일을 입출력할 때에는 조금씩 나누어 다 읽을 때까지 루프를 도는 것이 일반적이다.

public class BlockRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test.bin");
            int data;
            for ( ; ; ) {
                data = fileInputStream.read();
                if (data == -1) {
                    break;
                }
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
