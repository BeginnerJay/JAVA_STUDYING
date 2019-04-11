package chapter7;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("배추", "포메라니안");
        dogs[1] = new Dog("밀쿠", "똥개");
        dogs[2] = new Dog("순심이", "삽살개");
        dogs[3] = new Dog("철이", "마르티스");
        dogs[4] = new Dog("삐쭈", "푸들");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].showDogInfo());
        }
        System.out.println("");
        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
