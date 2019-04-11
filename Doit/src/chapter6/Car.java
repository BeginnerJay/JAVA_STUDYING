package chapter6;

public class Car {
    private static int serialNum = 10000;
    private int carNum;

    public Car() { // Car를 만드는 순간 시리얼넘버 1 증가. 그 증가된 번호가 차량 일련번호로 붙음
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
