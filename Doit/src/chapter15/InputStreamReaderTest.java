package chapter15;
// 바이트 스트림을 문자로 변환해 주는 보조 스트림이 InputStreamReader이다.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
