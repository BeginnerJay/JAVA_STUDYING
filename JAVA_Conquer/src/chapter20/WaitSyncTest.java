package chapter20;

public class WaitSyncTest {
    public static void main(String[] args) {
        chapter20.Memory memory = new chapter20.Memory(256);
        WaitDownLoad downLoad = new WaitDownLoad(memory);
        WaitPlay play = new WaitPlay(memory);

        downLoad.start();
        play.start();
    }
}
