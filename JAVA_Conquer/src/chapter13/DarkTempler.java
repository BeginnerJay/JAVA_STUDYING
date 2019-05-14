package chapter13;

public class DarkTempler implements Hideable {
    @Override
    public void hide() {
        System.out.println("스르르륵");
    }

    @Override
    public void move() {
        System.out.println("스멀스멀");
    }

    @Override
    public void attack() {
        System.out.println("쓱싹쓱싹");
    }
}
