package chapter9;

public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("DeskTop display()"); // 추상 메서드를 override
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()");
    }
    // 구현되지 않은 메서드를 모두 구현하거나
    // DeskTop 메서드를 추상 메서드로 만들어야 오류가 안난다.
}
