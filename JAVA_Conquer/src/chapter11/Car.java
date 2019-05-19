package chapter11;

class Car {
    String name;
    boolean gasoline;
    //int carNum;
    static int carNum = 0; // 명시적 초기화

    public Car(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
        carNum++;
    }

    static void resetNum() {
        carNum = 0;
    }

    static void printNum() {
        System.out.printf("현재 출고 대수 : %d\n", carNum);
    }

    void run() {
        if (gasoline==true) {
            System.out.println("부릉 부릉");
        } else {
            System.out.println("덜컹 덜컹");
        }
    }
}
