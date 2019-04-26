package chapter9;
// 템플릿 메서드(메서드의 실행 순서와 시나리오를 정의하는 것)
public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    public void washCar(){
        System.out.println("세차를 합니다.");
    }

    final public void run() { // 탬플릿 메서드
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
// Car 클래스를 상속받는 클래스는 구현되지 않은 추상 메서드를 마저 구현해야 한다.