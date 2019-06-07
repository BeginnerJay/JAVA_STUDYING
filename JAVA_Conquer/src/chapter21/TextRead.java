package chapter21;

import java.io.FileReader;
import java.io.IOException;

public class TextRead {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("test.txt");
            char[] text = new char[100];
            int num = fileReader.read(text);
            System.out.printf("읽은 문자 개수 : %d\n", num);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
