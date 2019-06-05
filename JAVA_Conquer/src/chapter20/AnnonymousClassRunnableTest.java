package chapter20;

public class AnnonymousClassRunnableTest {
    public static void main(String[] args) {
        Thread worker = new Thread(annonyousRunnable);
        worker.start();

        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println(num * num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }

    static Runnable annonyousRunnable = new Runnable() {
        @Override
        public void run() {
            for (int num = 0; num < PrintThread.DESTINATION; num++) {
                System.out.println("김재욱" + num);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
        }
    }; // 세미콜론 붙여줘야함
}
