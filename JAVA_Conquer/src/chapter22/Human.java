package chapter22;

public class Human {
    int age;
    Name name;

    Human(int age, String first, String family) {
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}
