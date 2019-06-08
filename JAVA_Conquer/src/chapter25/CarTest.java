package chapter25;

public class CarTest {
    public static void main(String[] args) {
        Car korando = new Car();
        korando.name = "코란도C";
        korando.gasoline = false;

        korando.run();
        korando.stop();
    }
}
