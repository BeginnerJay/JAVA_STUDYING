package lecture0430;

public class OutPutTest {
    public static void main(String[] args) throws NullPointerException {
        WriteSongFile songFile = new WriteSongFile("song.bin");
        songFile.writeSongNameInFile();
    }
}
