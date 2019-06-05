package chapter20;

public class PrintCosThread extends Thread{
    @Override
    public void run() {
        // super.run();
        double sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += Math.cos(i);
        }
        System.out.printf("cos = %f\n", sum);
    }
}
