package midassignment;


public class PlayListTest {

	public static void main(String[] args) throws Exception {
		int i = 0;
		java.util.Scanner menuin = new java.util.Scanner(System.in);
		PlayList myPlayList = new PlayList();
		while (i != 3) {
			System.out.println("1. 노래 제목 추가");
			System.out.println("2. 노래 제목 랜덤 출력");
			System.out.println("3. 종료");
			System.out.println("메뉴 번호 선택 : ");
			i = menuin.nextInt();
			
			switch(i) {
			case 1: 
				myPlayList.writeSongName();
				break;
			case 2:	
				myPlayList.readSongName();
				break;
			case 3: 
				break;
			default:
				System.out.println("번호 입력 오류, 재입력하세요.");
			}
		}
		menuin.close();
	}

}
