package chapter22;

public class Human3 {
    int age = 30;
    Name name = new Name();
    class Name {
        int age = 50;
        void intro() {
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Human3.this.age); // 얘만 30 출력
        }
    }
}
