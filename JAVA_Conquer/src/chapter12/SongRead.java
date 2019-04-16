package chapter12;

import java.io.FileInputStream;

public class SongRead {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("test.bin");
        byte[] inLine = new byte[64];
        int len = 0;
        String o_song;

        for ( ; ;) {
            len = in.read(inLine);
            if (len == -1) {
                break;
            }
            o_song = new String(inLine, "utf-8");
            System.out.println(o_song);
        }

        in.close();
    }
}
