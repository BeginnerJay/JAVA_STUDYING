package chapter24;

public class LimitSkip {
    public static void main(String[] args) {
        Data.nara.stream()
                .skip(2)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("==============");
        Data.nara.stream()
                .limit(5)
                .skip(2)
                .forEach(System.out::println);
    }
}
// 스트림은 딱 한 번만 읽을 수 있다(소모된다)
// 그래서 스트림은 저장해 두고 사용할 수 없으며, 필요할 때마다 매번 생성해서 사용한다.