package chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test.bin");
            int avail = fileInputStream.available(); // available 메서드로 얼마나 읽을 수 있는지 조사
            byte[] data = new byte[avail];
            fileInputStream.read(data);
            for (byte b : data) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
