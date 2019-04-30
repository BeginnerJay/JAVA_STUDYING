package midassignment;

import java.util.Scanner;

public class songmenu2 {
	
	public static void main(String[] args) throws Exception{
		PlayPlay myplay = PlayPlay.getInstance();
		int i = 0;
		Scanner in = new Scanner(System.in);
		while (i != 4) {
			System.out.println("************************");
			System.out.println("    1. 노래 제목 추가    ");
			System.out.println("    2. 노래 제목 목록 저장");
			System.out.println("    3. 노래 제목 랜덤하게 출력    ");
			System.out.println("    4. 종    료   ");
			System.out.println("************************");
			System.out.print("메뉴 번호 선택 : ");
			i = in.nextInt();

			switch (i) {
			case 1 :
				myplay.writeSongName();
				break;
			case 2 :
				myplay.saveSongName();
				break;
			case 3:
				myplay.readSongName();
				break;
			case 4:
				break;
			default:
				System.out.println("번호 입력 오류, 다시 입력");
			}
			
		}
		in.close();
	}
}

