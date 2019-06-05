package chapter20;

import chapter03.Int;

public class SingleThread {
    public static void main(String[] args) {
        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println("천민석");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Single Thread Interrupted");
            }
        }

        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println("김지혁");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Single Thread Interrupted");
            }
        }
    }
}
// 두 가지 작업을 동시에 처리하기 위해 스레드를 사용한다.