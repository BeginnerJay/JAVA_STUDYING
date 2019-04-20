package chapter12;

class AnimalTest {
    static void testAnimal(Animal animal) {
        // bark method는 인수로 전달된 animal이 Dog type일 때에만 호출할 수 있다.
            // animal이 과연 Dog 타입인지 instanceof 연산자로 점검한 후, 확실한 때에만 (Dog)로 다운캐스팅하여 bark 호출
        animal.move();
        if (animal instanceof Dog) {
            Dog mydog = (Dog)animal;
            mydog.bark();
            System.out.println();
        }
        if (animal instanceof Dove) {
            /*
            Dove mydove = (Dove)animal;
            mydove.fly();
            */
            ((Dove)animal).fly();
            // 임시 변수를 쓸 필요 없이 캐스팅과 메서드 호출을 한 번에 처리할 수도 있다.
                // 캐스트 연산자보다 연산자의 우선순위가 높아, 캐스팅을 먼저 한 후 메서드를 호출한다.
            System.out.println();
        // 부모가 자식을 대표하기 때문에, testDove나 testDog를 만들 필요 없이, testAnimal로 모든 자식 객체를 다룰 수 있다.
        }
        /*
        // 점검 대상인 동물을 Animal 타입의 인수로 전달받지만, 주로 개를 검사하는 경우가 많다고 하자.
        Dog mydog = (Dog)animal;
        mydog.move();
        mydog.bark();
        // 그래서 인수로 받은 animal 객체를 Dog 타입으로 다운캐스팅 한 후, move와 bark를 호출하여 테스트했다.
            // 동물을 개로 강제로 바꿨으니 bark도 이상 없이 호출할 수 있다.
        */
    }





    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Dove dove = new Dove();


        animal.move();
        System.out.println();

        dog.move();
        dog.bark();
        System.out.println();

        dove.move();
        dove.fly();
        System.out.println();

        // 부모 타입에 자식 객체 대입 : 부모 타입의 참조 변수는 자식 객체를 가리킬 수 있다.
        Animal milkoo = new Dog();

        milkoo.move();
        System.out.println();
        // milkoo.bark(); 에러


        // 자식 타입에 부모 객체 대입
        // 부모는 자식이 할 수 있는 것 중에 못하는 것이 있음 -> 자식 자료형으로 부모 객체 가리킬 수 없음.

        // Dove googoo = new Animal();
        // googoo.fly();

        // 업 캐스팅 -> 항상 안전(안되는 것들은 컴파일이 안됨)
            // 항상 안전해서 굳이 캐스트 연산자를 쓸 필요 없음 //Animal up = (Animal)dove; 이건 캐스트 연산자 쓴 것

        Animal up = dove; // 이렇게 캐스트 연산자 안 쓰고 바로 대입할 수 있음.
        up.move();
        System.out.println();
        // up.fly();

        // 다운 캐스팅 -> 위험할 수 있음(안되는 것도 컴파일이 됨 -> 실행 중에 에러)

        /*

        Dove down = (Dove)animal; // 현재 선언만 해도 에러 발생
        down.move();
        down.fly(); // 에러 발생하는 메서드
        // 컴파일러가 down이 현재 Dove 타입이므로 fly를 호출할 수 있다고 생각하는데, 그렇지 않다. -> 예외 발생

        */

        Dog baechu = new Dog();
        // 부모 타입의 parameter animal이 자식 타입 실인수 happy 대입 가능 -> 업캐스팅 필요 없다.
            // ex) testAnimal((Animal)baechu)
        // main에서 개를 전달했으므로, testAnimal에서 인수로 받은
        testAnimal(baechu);

        Dove googoo = new Dove();
        testAnimal(googoo);
    }
}
// 이동하는 기본 동작 외에 Dog는 짖는 동작이 가능하며 Dove는 날아다니는 동작이 가능하다.
// Animal 타입의 animal 변수를 선언하고, new 연산자로 Animal 타입의 객체를 생성하여 대입하는 것이 일반적. 그러나 예외
// 규칙 1 : 부모 타입의 참조 변수는 자식 객체를 가리킬 수 있다.
// 즉 좌우의 타입이 달라도 상속 관계에 있는 부모 타입의 변수로 자식 객체를 가리키는 것은 허용(is a 관계)
// 규칙 2 : 호출 가능한 메서드는 참조 변수의 타입을 따른다.
    // 변수와 객체의 타입이 다를 경우 적용된다.
    // 즉 Animal dog = new Dog();인 경우 Dog 객체를 가리키지만 자료형이 Animal이어서 Dog의 메서드를 호출할 수 없다.
    // 반대로 자식 타입의 변수가 부모 타입의 객체를 가리킬 수는 없다.(모든 동물이 다 날 수 있는 것은 아님)

// 객체 캐스팅
    // 객체도 캐스트 연산자로 타입을 바꿀 수 있되, 아무 상관이 없는 객체끼리는 변경할 수 없다.
        // 상속 관계에 있을 때에만 캐스팅 가능.

// instanceof
