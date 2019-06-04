package chapter19;
// 호출원에서 name에 null 전달하면 뻗는다 -> try-catch 이용
public class Throw2 {
    public static void main(String[] args) {
        String name = null;
        printScore(name);
    }

    static void printScore(String name) {
        try {
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("이름이 무효합니다.");
        }
    }
}
