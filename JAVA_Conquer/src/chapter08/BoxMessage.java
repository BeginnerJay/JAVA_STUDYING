package chapter08;

public class BoxMessage {
    static void outBox(String message) {
        OutCharsLn.outCharsLn("♥", message.length()+7);
        System.out.println("♥ " + message + " ♥");
        OutCharsLn.outCharsLn("♥", message.length()+7);
    }

    public static void main(String[] args) {
        outBox("金倫志");
    }
}
// 메서드가 알고리즘을 캡슐화하니 활용하기 쉽고, 필요하다면 다른 프로젝트로 가져가 재사용할 수도 있다.