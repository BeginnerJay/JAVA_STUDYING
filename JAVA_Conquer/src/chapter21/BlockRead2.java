package chapter21;

import java.io.FileInputStream;

public class BlockRead2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test.bin");
        byte[] data = new byte[2];
        int len;
        for (;;) {
            len = in.read(data);
            if (len == -1) break;
            for (byte b : data) {
                System.out.print(b);
            }
        }
        in.close();
    }
}
// 바이트 단위로 읽으나 블록 단위로 읽으나 버퍼를 상요하면 사실상 큰 차이는 없다.