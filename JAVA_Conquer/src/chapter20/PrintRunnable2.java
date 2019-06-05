package chapter20;

public class PrintRunnable2 extends PrintClass implements Runnable {
    @Override
    public void run() {
        printChar();
    }
}
// PrintClass를 상속받아 재정의한 후, 별도의 스레드에서 실행하고 싶다고 하자.
// PrintClass를 수정하려면 PrintClass를, 스레드에서 실행하려면 Thread를 상속받아햐 하는데, 자바는 다중 상속 지원 No.
// 그래서 run 메서드를 가지는 인터페이스를 구현하여, run 메서드를 구현한다.

