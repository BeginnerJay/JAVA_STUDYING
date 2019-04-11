package chapter6;

public class Starbucks {
    private String branch;
    private int customerCount;
    private int money;
    private String[] size = {"Short", "Tall", "Grande", "Venti"};

    public Starbucks(String branch) {
        this.branch = branch;
    }

    public void buyAme(String orderedSize) {
        if (orderedSize.equals(size[0])) {
            this.money += 3600;
        } else if (orderedSize.equals(size[1])) {
            this.money += 4100;
        } else if (orderedSize.equals(size[2])) {
            this.money += 4600;
        } else if (orderedSize.equals(size[3])) {
            this.money += 5100;
        }
        customerCount++;
    }

    public void showInfo() {
        System.out.printf("%s점 손님수 %d, 수입 %d\n", branch, customerCount, money);
    }
}
