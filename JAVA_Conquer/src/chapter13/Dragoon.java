package chapter13;

public class Dragoon implements Unit {
    @Override
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    @Override
    public void attack() {
        System.out.println("록타나리");
    }
}
