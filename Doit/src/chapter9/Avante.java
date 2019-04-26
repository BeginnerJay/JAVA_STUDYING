package chapter9;

public class Avante extends Car{
    @Override
    public void drive() {
        System.out.println("Avante 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("Avante 유리창 닦습니다.");
    }
}
