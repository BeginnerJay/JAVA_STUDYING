package chapter23;

public class LambdaThread {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> System.out.print("스레드가 출력한 문장"));
        worker.start();
    }
}
/*
psvm {
    Thread worker = new Thread(new Runnable() {
        public void run() {
            sout("출력한 문장");
        }
    });
원래는 익명 클래스 문법으로 이렇게 길게 써야 했다.
 */