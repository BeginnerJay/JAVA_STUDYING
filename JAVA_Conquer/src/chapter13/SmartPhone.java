package chapter13;

public class SmartPhone extends HandPhone implements Camera, Internet {
    @Override
    public void takePicture() {
        System.out.println("찰칵음향");
    }

    @Override
    public void access() {
        System.out.println("접속완료");
    }
}
