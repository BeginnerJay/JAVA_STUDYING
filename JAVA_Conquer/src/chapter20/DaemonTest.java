package chapter20;

public class DaemonTest {
    public static void main(String[] args) {
        PrintThread worker = new PrintThread("김재욱");
        worker.setDaemon(true);
        worker.start();
        // 프로그램 종료시에 스레드가 실행중이더라도 강제 종료되는 스레드가 데몬 스레드이다.
        for (int i = 0; i < 20; i++) {
            System.out.print(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
