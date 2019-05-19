package chapter11;

public class Thief extends Human{
    private String item;
    private int star;

    Thief(int age, String name, String item, int star) {
        super(age, name);
        setItem(item);
        setStar(star);
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setStar(int star) {
        this.star = star;
    }

    void steal() {
        System.out.println("살금 살금 슬쩍");
    }
}
