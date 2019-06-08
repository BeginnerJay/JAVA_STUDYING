package chapter24;

public class OptionFilterTest {
    public static void main(String[] args) {
        Human kim = new Human(29, "김상형", "삼성 아티브");
        useBook(kim);
    }

    static void useBook(Human human) {
        /*
        filter는 인수로 전달한 서술자로 객체를 점검하여, 조건을 만족하면 객체를 가진
        Optional 객체를 리턴하고, 그렇지 않으면 빈 객체를 리턴한다.
         */
        human.book.filter(b -> b.model.indexOf("삼성") != -1)
                .ifPresent(b -> System.out.println("삼성 노트북"));
        // 이름 문자열에 삼성이 포함되어 있으면 삼성 노트북이라고 출력한다.
    }
}
