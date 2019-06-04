package chapter19;
// throws 구문을 가진 메서드 호출시에는 try 블록을 구성해야 한다.
// main에서도 이 예외를 처리할 수 없거나 더 상위로 넘기고 싶다면
// main의 선언문에 throws 구문 표기
public class Throws {
    public static void main(String[] args) throws Exception {
        String name = null;
        printScore(name);
    }

    static void printScore(String name) throws Exception {
        if (name == null) {
            throw new Exception("이름이 무효합니다.");
        }
        System.out.println(name.length());
    }
}
// main이 던진 예외는 JVM에 의해 default 처리 -> 강제종료
// 그러므로 체크드 예외는 JVM이 받기 전에 누군가 처리해야 안뻗는다