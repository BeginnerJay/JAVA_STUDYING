package chapter6;

public class WorkerTest {
    public static void main(String[] args) {
        Worker workerKim = new Worker("Kim", 5000);

        Starbucks sbgr = new Starbucks("공릉");
        workerKim.gotoStarbucks(sbgr);
        workerKim.showInfo();
        sbgr.showInfo();

        CoffeeBean cbnw = new CoffeeBean();
        workerKim.gotoCoffeeBean(cbnw, 4500);
    }
}
