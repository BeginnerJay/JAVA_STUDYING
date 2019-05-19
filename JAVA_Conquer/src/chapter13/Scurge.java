package chapter13;

public class Scurge implements Unit {
    @Override
    public void move() {
        System.out.println("캬아아악");
    }

    @Override
    public void attack() {
        System.out.printf("자살공격\n");
    }
}
