package chapter9;

public class Genesis extends Car {
    @Override
    public void drive() {
        System.out.println("Genesis 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("Genesis 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("Genesis 유리창 닦습니다.");
    }
}
