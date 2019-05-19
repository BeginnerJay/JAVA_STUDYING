package chapter14;

public class CarTester {
    public static void main(String[] args) {
        Car korando = new Car();
        korando.name = "코란도C";
        korando.gasoline = false;

        korando.run();
        korando.stop();
    }
}