package chapter24;

public class NotebookHumanTest {
    public static void main(String[] args) {
        Human kim = new Human(29, "김상형", "센스");
        useBook(kim);

        Human lee = new Human(44, "이승우", null);
        useBook(lee);
    }

    static void useBook(Human human) {
        //System.out.println("내 노트북 : " + human.book.model);
        if (human.book.isPresent()) {
            String model = human.book.get().model;
            System.out.println("내 노트북 : " + model);
        } else {
            System.out.println("노트북이 없다.");
        }
        // isPresent 메서드로 노트북이 있는지 점검한 후, 있으면 get 메서드로 노트북을 읽고
        // 없으면 없다고 표시한다.
    }
}
