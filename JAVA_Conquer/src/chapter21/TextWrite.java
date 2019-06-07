package chapter21;

import java.io.FileWriter;
import java.io.IOException;

public class TextWrite {
    public static void main(String[] args) {
        String str = "자바 Stream 입출력";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("test.txt");
            fileWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                System.out.println("File Written");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
