package chapter12;
import java.io.*;
import java.sql.SQLOutput;

public class Song {
    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("test.bin", true);
        java.util.Scanner inCommand = new java.util.Scanner(System.in);

        String songName = "";
        byte[] outLine = new byte[64];
        String cont = "yes";

        while (cont.compareTo("yes")==0) {
            System.out.println("노래 제목 입력 : ");
            songName = inCommand.nextLine();

            outLine = songName.getBytes();
            out.write(outLine);

            System.out.println("Continue? (yes/no)");
            // inCommand.nextLine();
            cont = inCommand.nextLine();
        }

        inCommand.close();
        out.close();
    }
}
