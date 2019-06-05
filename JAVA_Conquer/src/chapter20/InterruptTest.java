package chapter20;

public class InterruptTest {
    public static void main(String[] args) {
        CalcThread worker = new CalcThread();
        worker.start();
    }
}