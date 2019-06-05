package chapter20;

public class WaitPlay extends Thread {
    chapter20.Memory memory;

    public WaitPlay(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void run() {
        // super.run();
        for (; ; ) {

            synchronized (memory) {
                try {
                    memory.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }

                for (int off = 0; off < memory.progress; off++) {
                    System.out.printf("%d ", memory.buffer[off]);
                }
                System.out.println();
            }
        }
    }
}
