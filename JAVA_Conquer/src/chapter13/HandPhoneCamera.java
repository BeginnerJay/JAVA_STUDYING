package chapter13;

public class HandPhoneCamera extends HandPhone implements Camera {
    @Override
    public void takePicture() {
        System.out.println("찰칵음향");
    }
}
// extends 절과는 달리 implements 절에는 얼마든지 많은 인터페이스를 콤마로 구분하여 나열할 수 있다.