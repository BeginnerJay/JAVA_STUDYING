package chapter12;
import java.io.*;
public class SongMenu {
    public static void main(String[] args) {
        int i = 0;
        java.util.Scanner in = new java.util.Scanner(System.in);
        while (i != 3) {
            System.out.println("************************");
            System.out.println("    1. 노래 제목 추가    ");
            System.out.println("    2. 노래 제목 랜덤하게 출력    ");
            System.out.println("    3. 종    료   ");
            System.out.println("************************");
            System.out.print("메뉴 번호 선택 : ");
            i = in.nextInt();

            switch (i) {
                case 1 :
                    writeSongName();
                    break;
                case 2:
                    readSongName();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("번호 입력 오류, 다시 입력");
            }
        in.close();
        }
    }
    static void writeSongName() {
        // 노래 제목을 입력해서 파일에 출력
        // 덮어쓰지 않고 파일에 추가하는 작업으로 출력
        // class name : SongWriteFile

    }

    static void readSongName() {
        // 파일이 저장된 노래 제목 수만큼 노래 제목 출력
        // 이 때 파일에서 노래 제목을 읽고 임의로 출력
        // 노래 제목 출력시 중복되지 않도록 출력
        // class name : SongReadFile
    }
}
