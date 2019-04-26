package chapter9;

public abstract class Notebook extends Computer{
    @Override
    public void display() {
        System.out.println("Notebook display()");
    }
}
// Notebook 클래스는 아직 구현하지 않은 추상 메서드가 있기 때문에 추상 클래스이다.