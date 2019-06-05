package chapter20;

public class Runnable2Test {
    public static void main(String[] args) {
        PrintRunnable2 printRunnable2 = new PrintRunnable2();
        Thread worker = new Thread(printRunnable2);
        worker.start();

        for (int num = 0; num <PrintThread.DESTINATION*3; num++) {
            System.out.println('X' + num);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
