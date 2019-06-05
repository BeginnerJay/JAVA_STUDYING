package chapter20;

public class SuspendTest {
    public static void main(String[] args) {
        PrintThread worker = new PrintThread("서스펜드");
        worker.start();

        for (int num = 0; num < worker.DESTINATION; num++) {
            System.out.println("실습중");
            try {
                Thread.sleep(200);
                Thread.yield(); // 할당한 시간을 포기하고 실행 시간을 양보하도록 요청 -> 스케줄러가 결정
                // 둘 다 정적 메서드여서, 외부에서 worker.sleep()처럼 호출하여 다른 스레드 실행 강제제어 불가
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
            if (num == 5) {
                worker.suspend(); // 권장하지 않는 메서드 -> 폐기되었다(강제 중지시 동기화 문제로 인한 데드락)
            }
            if (num == 25) {
                worker.resume();
            }
        }
    }
}
