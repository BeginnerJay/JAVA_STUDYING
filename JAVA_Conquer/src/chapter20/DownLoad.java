package chapter20;

public class DownLoad extends Thread {
    chapter20.Memory memory;

    public DownLoad(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void run() {
        // super.run();
        /*
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
         */
        for (int off = 0; off < memory.size; off += 2) {
            synchronized (memory) {
                for (int chunk = 0; chunk < 2; chunk++) {
                    memory.buffer[off + chunk] = off + chunk;
                    memory.progress = off + chunk + 1;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println(e);
                    } // 이렇게 하면 1바이트씩 받지 않고 2바이트씩 받는다.
                    // 이렇게 되면 미리 보기 스레드도 한 블록을 다 받았을 때에만 실행해야 한다.
                    // 두 스레드가 동시에 진입할 수 없는 영역을 크리티컬 섹션이라고 한다.
                /*
                syncronized(공유객체) {
                    // 이 영역이 크리티컬 섹션
                }
                 */
                }
            }
        }
    }
}
