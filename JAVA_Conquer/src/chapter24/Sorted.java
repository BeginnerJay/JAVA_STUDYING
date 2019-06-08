package chapter24;

public class Sorted {
    public static void main(String[] args) {
        Data.nara.stream()
                .map(Country::getName)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }
}
// 문자열은 사전순으로 비교 가능하여, 별다른 기준이 없어도 정렬이 가능하다.
// 다른 요소를 정렬할 때에는 그렇지 않을 수도 있다 -> Comparable 인터페이스를 구현해야 한다.
