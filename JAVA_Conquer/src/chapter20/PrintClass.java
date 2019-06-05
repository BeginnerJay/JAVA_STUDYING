package chapter20;

public class PrintClass {
    public void printChar() {
        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println('F'+ num);
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Thread Interrupted");
            }
        }
    }
}
