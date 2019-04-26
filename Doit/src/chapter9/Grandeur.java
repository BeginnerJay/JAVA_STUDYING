package chapter9;

public class Grandeur extends Car {
    @Override
    public void drive() {
        System.out.println("Grandeur 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("Grandeur 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("Grandeur 유리창 닦습니다.");
    }
}
