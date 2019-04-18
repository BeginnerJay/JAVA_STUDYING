package chapter11;

public class TruckTest {
    public static void main(String[] args) {
        Truck porter = new Truck("Porter", 1);

        porter.load();
        porter.run();
    }
}
