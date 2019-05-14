package chapter14;

public class Car {
    String name;
    boolean gasoline;

    void run() {
        if (gasoline) {
            System.out.println("부릉 부릉");
        } else {
            System.out.println("덜컹 덜컹");
        }
    }
    void stop() {
        System.out.println("끼이익");
    }
}