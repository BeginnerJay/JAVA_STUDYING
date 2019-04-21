package midassignment;

class Song {
	static int initialNum = 0; 
	private int songNum;
	private String songName;
	
	void setSongName(String songName) {
		this.songName = songName;
	}
	
	Song(String songName) {
		setSongName(songName);
		initialNum++;
		songNum = initialNum;
	}
}
