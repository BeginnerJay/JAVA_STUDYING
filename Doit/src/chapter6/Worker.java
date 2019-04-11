package chapter6;

public class Worker {
    public int money;
    public String workerName;

    public Worker(String workerName, int money) {
        this.workerName = workerName;
        this.money = money;
    }

    public void gotoStarbucks(Starbucks starbucks) {
        starbucks.buyAme("Tall");
        this.money -= 4100;
    }

    public void showInfo() {
        System.out.println(workerName + "님의 남은 돈은" + money + "입니다.");
    }

    public void gotoCoffeeBean(CoffeeBean coffeebean, int money) {
        String message = coffeebean.brewing(4500);
        if(message != null) {
            this.money -= money;
            System.out.println(workerName + " 님이 " + money +"으로"  + message);
        }
    }
}