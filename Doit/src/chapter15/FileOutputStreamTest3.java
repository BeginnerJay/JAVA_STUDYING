package chapter15;
// write(byte[] b, int off, int len)메서드는 배열의 전체 자료를 출력하지 않고, 배열의 off 위치부터 len길이만큼 출력

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("output3.txt", true)) {
            var bs = new byte[26];
            byte data = 65;
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fileOutputStream.write(bs, 2, 10); // 배열의 세 번째 위치부터 10개 바이트 출력
        } catch (FileNotFoundException e) {
          e.printStackTrace();
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("출력이 완료되었습니다.");
    }
}