package chapter6;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); // 싱글톤 패턴
        Car mySonota = factory.createCar(); // method에서 Car 생성
        Car yourSonata = factory.createCar();

        System.out.println(mySonota.getCarNum()); // 10001 출력
        System.out.println(yourSonata.getCarNum()); // 10002 출력
    }
}
