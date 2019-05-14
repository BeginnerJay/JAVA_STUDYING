package chapter15;
// overrite, append 여부를 parameter로 설정. default는 false

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("output.txt", true)) {
            fileOutputStream.write(65);
            fileOutputStream.write(66);
            fileOutputStream.write(67);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("written");
    }
}
