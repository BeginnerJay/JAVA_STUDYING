package chapter9;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=========자율 주행하는 자동차=========");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("사람이 운전하는 자동차");
        Car hiscar = new ManualCar();
        hiscar.run();

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Avante());
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Genesis());
        for (Car car : carList) {
            car.run();
            System.out.println("===================");
        }

    }
}
// 상위 클래스를 상속받은 하위 클래스에서 탬플릿 메서드를 재정의하면 안 된다.
    // 그래서 탬플릿 메서드는 final 예약어를 사용한다.
    // 탬플릿 메서드는 로직 흐름을 정의하는 역할 -> 모든 하위 클래스가 공동 사용 -> final로 선언