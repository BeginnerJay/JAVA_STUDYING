package chapter21;

import java.io.FileReader;
import java.io.LineNumberReader;

public class ReadLine {
    public static void main(String[] args) throws Exception {
        LineNumberReader in = new LineNumberReader(new FileReader("주저하는 연인들을 위해_UTF8.txt"));
        for (;;) {
            String Line = in.readLine();
            if (Line == null) break;
            int Num = in.getLineNumber();
            System.out.printf("%4d : %s\n", Num, Line);
        }
        in.close();
    }
}
