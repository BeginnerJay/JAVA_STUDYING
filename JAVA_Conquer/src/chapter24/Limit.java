package chapter24;

public class Limit {
    public static void main(String[] args) {
        Data.nara.stream()
                .limit(4)
                .forEach(System.out::println);
    }// 앞쪽 4개
}
