package chapter8;

public class AniamlTest1 {
    public static void main(String[] args) {
        MoveAnimal aTest = new MoveAnimal();
        aTest.moveAnimal(new Animal());
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }
}
// Animal에서 상속받은 클래스가 매개변수로 넘어오면 모두 Animal형으로 변환 -> animal.move() 호출 가능
// 그런데 animal.move가 호출하는 메서드는 Animal의 것이 아닌 실제 인스턴스의 메서드
