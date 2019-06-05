package chapter20;

import java.awt.Toolkit;

public class BeepThread extends Thread {
    int count;
    int gap;
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    public BeepThread(int count, int gap) {
        this.count = count;
        this.gap = gap;
    }

    public void run() {
        for(int num = 0; num < count; num++) {
            toolkit.beep();
            try {
                Thread.sleep(gap);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
