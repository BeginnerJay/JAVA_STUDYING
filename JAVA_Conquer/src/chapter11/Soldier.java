package chapter11;

public class Soldier extends Human{
    private int milnum;

    Soldier(int age, String name, int milnum) {
        super(age, name);
        setMilnum(milnum);
    }

    public void setMilnum(int milnum) {
        this.milnum = milnum;
    }

    void fight() {
        System.out.println("앞으로 전진! 빵야빵야");
    }
}
