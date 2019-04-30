package Lecture0430;
import java.io.*;
public class InputTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("song.bin");
        int len = 0;
        byte[] oneRecord = new byte[51];
        for ( ; ; ) {
            len = in.read(oneRecord);
            if (len == -1) {
                break;
            }
            String tmp = new String(oneRecord, "utf-8");
            System.out.println(tmp);
        }
    }
}
