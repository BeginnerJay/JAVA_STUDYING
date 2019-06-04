package chapter19;
// try-catch로는 예외를 처리했을 뿐, 완전히 해결한 것은 아니다.
// 애초에 인수가 잘못 전달 -> 예외를 상위로 던져 알린다
public class Throw3 {
    public static void main(String[] args) {
        String name = null;
        try {
            printScore(name);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    static void printScore(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("이름이 무효합니다.");
            // 어떤 예외 던지는지 명시 필요
        }
        System.out.println(name.length());
    }
}
