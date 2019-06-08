package chapter24;

public class Distinct {
    public static void main(String[] args) {
        Data.nara.stream()
                .map(c -> c.cont)
                .distinct()
                .forEach(System.out::println);
    }
    // 앞에 나오지 않은 요소만 추가하는 스트림이다.
}
