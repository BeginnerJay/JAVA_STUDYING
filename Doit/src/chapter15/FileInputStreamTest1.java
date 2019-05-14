package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) { // 스트림이 null인 경우
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
// 열려 있ㄴㄴ 스트림을 닫기 위해 close() 호출하는데, 스트림이 없으므로 NullPointerException 발생.