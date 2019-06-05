package chapter20;

public class Play extends Thread {
    chapter20.Memory memory;

    public Play(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void run() {
        // super.run();
        for (; ; ) {
            /*
            synchronized (memory) {
                for (int off = 0; off < memory.progress; off++) {
                    System.out.printf("%d ", memory.buffer[off]);
                }
                System.out.println();
            }
             */
            memory.PlayDowned();
            // 메서드 선언문 앞에 syncronized 키워드를 붙이면 메서드 전체가 크리티컬로 된다.
            if (memory.progress == memory.size)
                break;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);

            }
        }
    }
}
