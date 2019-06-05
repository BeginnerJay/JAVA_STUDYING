package chapter20;

public class Memory {
    int[] buffer;
    int size;
    int progress;

    public Memory(int size) {
        this.size = size;
        buffer = new int[size];
        progress = 0;
    }

    synchronized void DownChunk(int off) {
        for (int chunk = 0; chunk < 2; chunk++) {
            buffer[off+chunk] = off+chunk;
            progress = off+chunk+1;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }

    synchronized void PlayDowned() {
        for (int off = 0; off < progress; off++) {
            System.out.printf("%d ", buffer[off]);
        }
        System.out.println();
    }
}
