package chapter20;

public class NonObjectThreadTest {
    public static void main(String[] args) {
        Thread worker = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int num = 0; num < PrintThread.DESTINATION; num++) {
                    System.out.println("띠용");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        worker.start();

        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println("이 구조 뭐지");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// 러너블은 단 하나의 객체만 필요하므로, 굳이 객체를 선언할 필요 없이 객채 생성문을 Thread의 생성자 안에 넣을 수 있다.