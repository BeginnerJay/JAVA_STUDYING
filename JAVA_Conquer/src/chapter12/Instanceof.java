package chapter12;
// 12-1-3. instanceof
// 다운 캐스팅은 위험하지만 조건을 맞추면 안전하게 사용 가능하다.
public class Instanceof {
    static void testAnimal(Animal animal) {
        Dog mydog = (Dog)animal;
        mydog.move();
        mydog.bark();
    }

    public static void main(String[] args) {
        Dog happy = new Dog();
        testAnimal(happy);

        Dove donald = new Dove();
        testAnimal(donald); // 컴파일에서는 에러 안나고 실행 중에 에러가 난다.
    }
}
// 인수로 받은 animal 객체를 Dog 타입으로 다운캐스팅 한 후, move와 bark를 호출하여 테스트했다.
// 동물을 개로 강제로 바꿨으니 bark도 이상 없이 호출할 수 있다.

// main에서 Dog 타입의 객체 happy를 생성하고, 이 객체를 testAnimal로 전달했다. 메서드 호출시 인수 전달은 대입이다.
// 부모 타입의 형식 인수 animal이 자식 타입의 실인수 happy를 대입받을 수 있어 다음과 같이 업 캐스팅 할 필요가 없다.
// testAnimal((Animal)happy); 그냥 개를 던지면 메서드가 알아서 동물로 받는다.
// main에서 개를 전달했으므로, testAnimal에서 인수로 받은 animal을 다시 Dog로 다운캐스팅해도 안전하다.
// 다운 캐스팅은, 객체가 캐스팅하는 타입이 확실하므로 컴파일러에게 더 이상 이의를 제기하지 말라고 하는 것이다.
// 물론 testAnimal이 Dog 타입을 받으면 캐스팅할 필요가 없어서 문제는 간단해지지만, 메서드는 범용적으로 작성해야 한다.

// 비둘기도 동물이므로 testAnimal의 인수로 전달 가능하며, 컴파일도 가능하다.
// 하지만 donald는 Dog이 아니므로 (Dog)로 캐스팅할 수 없다.
// 인수로 받은 animal이 Dog이라고 확신하고 (Dog)한 것인데 그렇지 않았던 것!
// 이 문제를 해결하려면 객체의 타입을 판별해야 하며, 이럴 때 instanceof 연산자를 사용한다. -> 객체 instanceof 타입
