package chapter20;
// Thread 클래스를 상속받는 방법이 가장 간단하지만, 자바 특성상 상속이 어려울 수도 있다.
// 그럴 때에는 run 메서드를 정의하는 Runnable 인터페이스의 구현 클래스르 정의하고
// 이 클ㄹ래스의 객체를 Thread의 생성자로 전달한다.
// run 메서드를 누가 구현하는가의 차이만 있을 뿐, 거의 같은 방법이다.
public class PrintRunnable implements Runnable{
    public void run() { // 인터페이스에 있던 메서드 직접 구현하기
        for (int num = 0; num < PrintThread.DESTINATION; num++) {
            System.out.println("김효주");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
                System.out.println("Thread Interrupted");
            }
        }
    }
}
