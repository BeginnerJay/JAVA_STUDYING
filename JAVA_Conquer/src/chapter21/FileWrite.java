package chapter21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        byte[] data = { 8, 9, 0, 6, 2, 9, 9 };
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("test.bin");
            out.write(data);
            System.out.println("Write success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File output error");
            e.printStackTrace();
        } finally {
            try {
                out.close();
            }
            catch (Exception e) {;}
        }
    }
}
/*
파일은 메모리 외부에 있어 입출력 과정에 예외가 발생할 수 있다. -> 반드시 try
또한 close문도 반드시 호출해야 한다 => finally 블록 필요
close 중에도 예외가 발생할 수 있음 -> finally 블록 안에서도 try 블록이 필요하다.
예외 블록 구조로 인해 out 객체를 선언과 동시에 초기화하지 못함 -> 밖에서 선언하고 null로 초기화

 */