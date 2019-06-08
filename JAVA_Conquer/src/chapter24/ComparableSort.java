package chapter24;

public class ComparableSort {
    public static void main(String[] args) {
        Data.nara.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
/*
요소가 비교 기능을 제공하지 않으면, sorted 메서드의 인수로 두 요소를 비교하는
Comparator 객체를 전달한다.

Data.nara.stream()
    .sorted(new Comparator<Country>() {
        public int compare(Country o1, Country o2) {
            return o1.popu - o2.popu;
        }
    })
    .forEach(s -> sout(s));

Data.nara.stream()
    .sorted((o1, o2) ->o1.popu - o2.popu)
    .forEach(System.out::println);

 */