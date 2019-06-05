package chapter20;
/*
스레드는 하나의 클래스.
run이 return하면 스레드도 종료된다.
스레드 클래스를 정의한 후, main에서 스레드 객체를 생성한다.
스렏 객체를 생성한 후 void start() 로 기동한다.
 */
public class PrintThread extends Thread{
    public static final int DESTINATION = 30;

    String ch;

    PrintThread(String ch) {
        super();
        this.ch = ch;
    }
    // 멤버에 따라 다르게 동작하도록 만들기
    public void run() {
        int num;
        for (num = 0; num < DESTINATION; num++) {
            System.out.println(ch);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
