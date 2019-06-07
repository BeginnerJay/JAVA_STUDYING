package chapter21;

import java.io.*;

public class ReadString {
    public static void main(String[] args) {
        String str = ReadFileToString("뜨거운 여름밤은 가고 남은 건 볼품없지만.txt");
        System.out.println(str);

        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;

        byte[] ANSIstr;
        FileOutputStream fileOutputStream = null;
        try {
            ANSIstr = str.getBytes("euc-kr");
            fileOutputStream = new FileOutputStream("뜨거운 여름밤은 가고 남은 건 볼품없지만_ANSI.txt");
            fileOutputStream.write(ANSIstr);

            fileInputStream = new FileInputStream("뜨거운 여름밤은 가고 남은 건 볼품없지만.txt");
            inputStreamReader = new InputStreamReader(fileInputStream, "euc-kr");
            char[] text = new char[1000];
            int num = inputStreamReader.read(text);
            System.out.println(text);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                System.out.println("Successfully Written");
                inputStreamReader.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String ReadFileToString(String Path) {
        StringBuffer Result = new StringBuffer();
        int ch;
        try {
            BufferedReader in = new BufferedReader(new FileReader(Path));
            for (;;) {
                ch = in.read();
                if (ch == -1) break;
                Result.append((char)ch);
            }
        }
        catch (Exception e) {;}
        return Result.toString();
    }
}

