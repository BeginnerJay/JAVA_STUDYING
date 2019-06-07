package chapter21;

import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter("format.txt");
        int i = 1234;
        double d = 56.789;
        String str = "문자열";
        out.printf("%6d, %10.2f, %s", i, d, str);
        out.close();
    }
}
