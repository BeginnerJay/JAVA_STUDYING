package chapter6;

public class CarFactory {
    private static int initialNum = 10001;
    int carNum;
    private CarFactory() {

    } // 1. implement private constructor
    private static CarFactory instance = new CarFactory(); // 2. implement the only instance
    // 3. 외부에서 인스턴스를 사용할 수 있도록 하는 public method 선언
    // 인스턴스 생성 여부와 상관없이 사용할 수 있도록 static 지정 필수!
    static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }

    /*
    public Car createCar() {

        Car car = new Car();
        initialNum++;
        carNum = initialNum;
        return car;
    }

    int getCarNum() {
        return carNum;
    }
     */

    // 자동차 공장 만드는 클래스와, 차에 번호 붙이는 클래스는 분리되어야 한다.
    // 각 객체가 하나의 행동을 하도록 만드는 것이 OOP의 핵심!
}
