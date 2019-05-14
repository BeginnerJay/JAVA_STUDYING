package chapter13;

public class Medic implements Healing{
    @Override
    public void heal() {
        System.out.println("샤방샤방");
    }

    @Override
    public void move() {
        System.out.println("쫄래쫄래");
    }

    @Override
    public void attack() {
        System.out.println("공격못함");
    }
}
