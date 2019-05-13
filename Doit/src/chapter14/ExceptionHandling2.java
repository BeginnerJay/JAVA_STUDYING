package chapter14;
// 프로그램이 정상적으로든 비정상적으로든 종료되면 리소스를 닫아야 한다.
// 계속 수행되는 서비스 등에서는 리소스를 안닫으면 뻗는다 -> close() 해줘야!
// 일단 try 블록이 수행되면, finally 블록은 어떤 경우에도(return이 있거나 해도) 수행된다.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("항상 수행됩니다.\n");
        }
        System.out.println("여기도 수행됩니다.");
    }
}
// 1. 입력받은 파일 없음 -> FileNotFoundException 처리
// 2. close() 할 때 예외 -> IOExeption 처리