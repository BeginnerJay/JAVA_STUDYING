package chapter8;

public class MoveAnimal {
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
// 이 메서드는 어떤 인스턴스가 매개변수로 넘어와도 모두 Animal 형으로 변환한다.