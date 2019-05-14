package chapter15;
// 파일에 내용이 얼마나 있는지 모르는 경우 -> 파일 끝까지 반복해서 읽기

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        // try-with-resources문
        try(FileInputStream fileInputStream = new FileInputStream("input.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
