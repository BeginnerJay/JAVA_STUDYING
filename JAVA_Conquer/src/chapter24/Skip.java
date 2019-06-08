package chapter24;

public class Skip {
    public static void main(String[] args) {
        Data.nara.stream()
                .skip(7)
                .forEach(System.out::println);
    } // 앞 7개 제끼고 시작
}
