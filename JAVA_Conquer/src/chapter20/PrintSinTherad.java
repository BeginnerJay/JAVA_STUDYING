package chapter20;

public class PrintSinTherad extends Thread{
    @Override
    public void run() {
        // super.run();
        double sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += Math.sin(i);
        }
        System.out.printf("sin = %f\n", sum);
    }
}
