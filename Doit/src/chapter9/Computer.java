package chapter9;

public abstract class Computer {
    public abstract void display();
    public abstract void typing(); // 오류 발생 -> 몸체를 작성하거나 추상 메서드로 바꿔라.
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
