package chapter7;
import java.util.ArrayList;
public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("배추","포메라니안"));
        dogs.add(new Dog("밀쿠", "똥개"));
        dogs.add(new Dog("순심이", "삽살개"));
        dogs.add(new Dog("철이", "마르티스"));
        dogs.add(new Dog("삐쭈", "푸들"));

        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = dogs.get(i);
            System.out.println(dog.showDogInfo());

        }
        System.out.println("");
        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
