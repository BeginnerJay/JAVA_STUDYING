package chapter20;

public class CalcThread extends Thread {
    @Override
    public void run() {
        // super.run();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("\n계산 완료");
    }
}
