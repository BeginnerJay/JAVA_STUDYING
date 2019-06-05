package chapter20;

public class WaitDownLoad extends Thread {
    chapter20.Memory memory;

    public WaitDownLoad(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void run() {
        // super.run();
        for (int off = 0; off < memory.size; off++) {
            memory.buffer[off] = off;
            memory.progress = off + 1;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
        synchronized (memory) {
            memory.notify(); // 다운로드 완료. 재생 스레드의 대기를 깨움
        }
    }
}
