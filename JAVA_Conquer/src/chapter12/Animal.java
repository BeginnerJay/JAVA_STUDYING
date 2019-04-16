package chapter12;

class Animal {
    void move() {
        System.out.println("왔다리 갔다리");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("멍멍멍");
    }
}

class Dove extends Animal {
    void fly() {
        System.out.println("퍼득 퍼득");
    }
}

class JavaTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        // 부모 타입에 자식 객체 대입
        Animal dog = new Dog();
        dog.move();
        // dog.bark(); 에러

        // 자식 타입에 부모 객체 대입
        // Dove dove = new Animal();
        // dove.fly();
    }
}
// 이동하는 기본 동작 외에
// Dog는 짖는 동작이 가능하며 Dove는 날아다니는 동작이 가능하다.
// Animal 타입의 animal 변수를 선언하고, new 연산자로 Animal 타입의 객체를 생성하여 대입하는 것이 일반적. 그러나 예외
// 규칙 1 : 부모 타입의 참조 변수는 자식 객체를 가리킬 수 있다.
// 즉 좌우의 타입이 달라도 상속 관계에 있는 부모 타입의 변수로 자식 객체를 가리키는 것은 허용(is a 관계)
// (변수와 객체의 타입이 다를 경우 적용되는) 규칙 2 : 호출 가능한 메서드는 참조 변수의 타입을 따른다.
// 즉 Animal dog = new Dog();인 경우 Dog 객체를 가리키지만 자료형이 Animal이어서 Dog의 메서드를 호출할 수 없다.
// 반대로 자식 타입의 변수가 부모 타입의 객체를 가리킬 수는 없다.(모든 동물이 다 날 수 있는 것은 아님)