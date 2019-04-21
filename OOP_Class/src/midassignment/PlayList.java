package midassignment;

import java.util.ArrayList;
import java.util.Collections;
class PlayList {
	static ArrayList<Song> playlist; // = new ArrayList<Song>();
	String songin;
	PlayList() {}

	void writeSongName() {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("노래 제목을 입력하세요 : ");
		songin = in.nextLine();
		playlist.add(new Song(songin));
		in.close();
		System.out.println("노래가 추가되었습니다.");
	}

	void readSongName() {
		Collections.shuffle(playlist);

		for (int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i));
		}

	}
}