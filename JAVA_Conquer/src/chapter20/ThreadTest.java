package chapter20;

// 스레드는 객체이며, 실행 중에 얼마든지 생성할 수 있다.

public class ThreadTest {
    public static void main(String[] args) {
        PrintThread printThreadWorker = new PrintThread("미쳐따리");
        printThreadWorker.start();

        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println("조성우");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Thread Interrupted");
            }
        }
    }
}
