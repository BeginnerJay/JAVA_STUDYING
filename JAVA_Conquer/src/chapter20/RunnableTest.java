package chapter20;

public class RunnableTest {
    public static void main(String[] args) {
        PrintRunnable printRunnable = new PrintRunnable();
        Thread worker = new Thread(printRunnable);
        worker.start();

        for (int num = 0; num < PrintThread.DESTINATION*57; num++) {
            System.out.println("공부좀해라");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Thread Interrupted");
            }
        }
    }
}
