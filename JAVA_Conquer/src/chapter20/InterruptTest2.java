package chapter20;

public class InterruptTest2 {
    public static void main(String[] args) {
        CalcThread2 worker = new CalcThread2();
        worker.start();

        try { Thread.sleep(3000); } catch (InterruptedException e) { ; }
        worker.interrupt();
    }
}

// 스레드 기동 후 작업을 시키다가 3초 후 어떤 조건에 의해 이 작업을 중단하고 싶다면
// interrupt 메서드로 중단을 지시한다.

/*
인터럽트되었는지 조사하는 메서드
    static boolean interrupted() // 정적 메서드(현재 스레드에 대한 정보만 조사), 인터럽트 상태 해제
    boolean isinterrupted() // 임의의 스레드에 대해 조사 가능. 플래그는 그대로 유지
 */

class CalcThread2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("\n계산 취소");
            return;
        }
        System.out.println("\n계산 완료");
    }
}