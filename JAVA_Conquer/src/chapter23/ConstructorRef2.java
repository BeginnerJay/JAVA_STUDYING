package chapter23;

import java.util.function.Function;

class Animal {
    String name;
    Animal(String name) { this.name = name; }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
}

class Cow extends Animal {
    Cow(String name) { super(name); }
}
public class ConstructorRef2 {
    public static void main(String[] args) {
        addAnimal(Dog::new, "멍멍이");
        addAnimal(Cow::new, "음메에");
    }

    static void addAnimal(Function<String, Animal> creator, String s) {
        Animal anim = creator.apply(s);
        System.out.println(anim.name);
    }
}
// 메서드 레퍼런스를 람다식드로 바꾼 후 어떤 인수를 취하고 어떤 타입을 리턴하느가에 따라
// 적당한 함수형 인터페이스를 선택해 대입받으면 된다.