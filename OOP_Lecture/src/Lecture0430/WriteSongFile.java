package Lecture0430;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteSongFile {
    // 노래 제목에 몇 개가 들어갈 지 모르기 때문에 ArrayList를 생성하였습니다.
    static ArrayList<String> playlist = new ArrayList<>(); // = new ArrayList<String>();

    String fn;
    final int recordSizeByte = 51;
    final byte paddingChar = 0x00;
    FileOutputStream out = null;

    WriteSongFile(String fn) {
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
                playlist.add(songName);

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
            // continue에서 no가 된 경우에만 arrayList 전체를 출력하도록 했습니다.
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println(playlist.get(i));
            }

            out.close();
        }
        catch (IOException e) {
            System.out.println("File Open Error!!!");
        }

        in.close();
    }
}
