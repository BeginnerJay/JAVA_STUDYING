package chapter8;

public class AnimalTest2 {
    public static void main(String[] args) {
        AnimalMethod animalMethod = new AnimalMethod();
        animalMethod.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        animalMethod.testCasting();
    }
}
// 각 동물 클래스를 인스턴스로 생성하여, Animal형으로 선언한 배열에 추가한다.
    // 이렇게 되면 배열에 추가되는 요소의 자료형은 모두 Animal형으로 변환된다.
    // 이 때에는 호출할 수 있는 메서드는 Animal 클래스에 있는 것들뿐이다.
        // 모든 배열 요소를 꺼내 move() 메서드를 호출하면, 각각의 클래스에 맞춰 override된 것들이 나온다.
    // 배열 요소의 자료형이 모두 Aniaml -> 각 클래스의 고유한 메서드는 사용 불가능
        // 각각의 클래스의 메서드를 호출하려면 다시 원래 자료형으로 다운캐스팅 필요하다.
        // instanceof를 활용하여, 실제 인스턴스형을 살펴본 후에 다운 캐스팅 -> 오류 없이 가능.