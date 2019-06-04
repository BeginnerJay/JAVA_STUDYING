package chapter19;

public class Finally {
    public static void main(String[] args) {
        System.out.println("접속");
        try {
            System.out.println("전송");
        }
        catch(Exception e) {
            System.out.println("예외 처리");
        }
        finally {
            System.out.println("해제");
        }
    }
}
