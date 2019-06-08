package chapter24;

public class Filter {
    public static void main(String[] args) {
        Data.nara.stream()
                //.filter(Country::isOecd)
                .filter(c -> c.oecd)// 나라 객체 c를 받아 oecd 객체를 리턴한다.
                // filter가 컬렉션 순회하며, oecd가 true인 나라만 골라낸다.
                .forEach(System.out::println);
    }
}
