package MidTest;
import java.io.*;
import java.util.Scanner;

public class Q1 {
    String fn;
    final int recordSizeByte = 51;
    final byte paddingChar = 0x41;
    FileOutputStream out = null;

    Q1(String fn) {
        this.fn = fn;
    }

    void writeSongNameInFile() {
        String cont = "yes";
        String songName = "";
        byte[] oneRecord = new byte[recordSizeByte];
        Scanner in = new java.util.Scanner(System.in);

        try {
            out = new FileOutputStream(fn, true);
            while (cont.compareTo("yes")==0) {
                System.out.printf("input song name : ");
                songName = in.nextLine();

                if (songName.length() >= recordSizeByte) {
                    System.out.println("The maximum length of the song name exceeded 50 byte!!!");
                    System.out.printf("Continue? (yes / no) ");
                    cont = in.nextLine();
                    continue;
                }
                oneRecord[0] = (byte)songName.length();

                for (int i = 1; i < songName.length()+1; i++) {
                    oneRecord[i] = (byte)songName.charAt(i-1);
                }

                for (int i = songName.length()+1; i < recordSizeByte; i++) {
                    oneRecord[i] = paddingChar;
                }
                out.write(oneRecord);
                // 계속하겠냐고 물어보기
                System.out.printf("Continue? (yes / no) ");
                cont = in.nextLine();

            }



            out.close();
        }
        catch (IOException e) {
            System.out.println("File Open Error!!!");
        }

        in.close();
    }
}
