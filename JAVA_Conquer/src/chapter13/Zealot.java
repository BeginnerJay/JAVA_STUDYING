package chapter13;

class Zealot implements Unit {
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }
    public void attack() {
        System.out.println("지직지직");
    }

    @Override
    public void die() {
        System.out.println("으어어어");
    }
}