package Ramen;

public class RamenCook implements Runnable {

    private int ramenCount;
    private String[] burners = {"_", "_", "_", "_"};

    public RamenCook(int ramenCount) {
        this.ramenCount = ramenCount;
    }

    @Override
    public void run() {
        while (ramenCount > 0) {

            synchronized (this) {
                ramenCount--;
                System.out.printf("%s : %d개 남음\n", Thread.currentThread().getName(), ramenCount);
            }

            for (int i = 0; i < burners.length; i++) {
                if (!burners[i].equals("_"))
                    continue;

                synchronized (this) {
                    burners[i] = Thread.currentThread().getName();
                    System.out.printf("             %s : %d번 버너 ON\n", Thread.currentThread().getName(), i+1);
                    showBurners();
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (this) {
                    burners[i] = "_";
                    System.out.printf("                         %s : %d번 버너 OFF\n",
                            Thread.currentThread().getName(), i+1);
                    showBurners();
                }
                break;
            }

            try {
                Thread.sleep(Math.round(1000*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void showBurners() {
        String stringToPrint = "                                    ";
        for (int i = 0; i < burners.length; i++) {
            stringToPrint += (" " + burners[i]);
        }
        System.out.println(stringToPrint);
    }

}
