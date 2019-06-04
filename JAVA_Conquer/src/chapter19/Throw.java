package chapter19;
// 예외 원인이 외부 -> 메서드에서 처리하는 것보다 일으킨 곳에서 처리하자
public class Throw {
    public static void main(String[] args) {
        String name = "빌게이츠";
        printScore(name);
    }

    static void printScore(String name) {
        System.out.println(name.length());
    }
}
