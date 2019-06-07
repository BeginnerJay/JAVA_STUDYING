package chapter21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedText {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    "뜨거운 여름밤은 가고 남은 건 볼품없지만.txt"));
            char[] text = new char[1024];
            int num = bufferedReader.read(text);
            System.out.printf("읽은 문자 개수 : %d\n", num);
            System.out.println(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
