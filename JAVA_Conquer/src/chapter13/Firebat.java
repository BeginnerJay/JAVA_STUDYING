package chapter13;

public class Firebat implements Unit {
    @Override
    public void move() {
        System.out.println("아장아장");
    }

    @Override
    public void attack() {
        System.out.println("불꽃뿜뿜");
    }
}
