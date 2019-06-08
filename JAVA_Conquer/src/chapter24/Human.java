package chapter24;

import java.util.Optional;

public class Human {
    int age;
    String name;
    Optional<Notebook> book;

    //Notebook book;
    // 사실 사람이 노트북을 가질 수도 안 가질 수도 있다.
    // 주인이 없는 노트북도 있을 수 있다.
    Human(int age, String name, String model) {
        //book = new Notebook(model);
        if (model == null || model.length() == 0) {
            book = Optional.empty();
        } else {
            book = Optional.of(new Notebook(model));
        }

        this.age = age;
        this.name = name;
    }
}
