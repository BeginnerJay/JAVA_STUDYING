package chapter24;
// map은 객체의 값으로부터 함수를 호출하여, 다른 타입의 값을 추출해 형태를 변경한다.
// 빈 객체이면 반환되는 값도 빈 객체이다.
public class OptionalMapTest {
    public static void main(String[] args) {
        Human kim = new Human(29, "김상형", "");
        useBook(kim);
    }

    static void useBook(Human human) {
        String model = human.book.map(b -> b.model).orElse("이름없음");
        System.out.println(model);
    }
}
