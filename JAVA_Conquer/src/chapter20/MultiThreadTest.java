package chapter20;

public class MultiThreadTest {
    public static void main(String[] args) {
        PrintThread worker1 = new PrintThread("김재욱");
        worker1.start();
        PrintThread worker2 = new PrintThread("공부해라");
        worker2.start();
        BeepThread beepThread = new BeepThread(50, 100);
        beepThread.start();

        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println("삐삐삐삐");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
