package chapter24;

public class IfPresentTest {
    public static void main(String[] args) {
        Human kim = new Human(29, "김상형", "레노보");
        useBook(kim);
        Human lee = new Human(44, "이승우", null);
        useBook(lee);
    }

    static void useBook(Human human) {
        human.book.ifPresent(b -> System.out.println("내 노트북 : " + b.model));
    }
}
// 노트북을 가진 경우에만 출력되며, 그렇지 않으면 출력문을 무시한다.