package chapter10;

public class CarTest {
    public static void main(String[] args) {
        System.out.printf("생성 전 : %d\n", Car.carNum);

        Car.printNum();

        Car sonata = new Car("Sonata", true);
        System.out.printf("%s : %d\n", sonata.name, sonata.carNum);

        Car starex = new Car("Starex", false);
        System.out.printf("%s : %d\n", starex.name, starex.carNum);

        Car.printNum();
        Car.resetNum();

        Car pride = new Car("Pride", true);
        System.out.printf("%s : %d\n", pride.name, starex.carNum);

        Car.printNum();
    }
}
// carNum 멤버 변수가 각 객체에 소속되기 때문에, 객체가 생성될 때마다 새로운 메모리가 할당된다.
    // 기본값인 0으로 초기화되엇다가 생성자에서 1 증가한다.
    // 각 차가 한 번씩 생성되니 항상 1일 수밖에 없다.
// carNum 필드가 정적이니 이를 조작하는 메서드도 정적이다.