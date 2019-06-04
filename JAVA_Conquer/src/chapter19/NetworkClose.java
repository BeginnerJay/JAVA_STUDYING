package chapter19;
// 네트웍 접속, DB 오픈 등은 직접 해야 한다 -> 항상 해제 필요. finally에
public class NetworkClose {
    public static void main(String[] args) {
        System.out.println("접속");
        try {
            System.out.println("전송");
            System.out.println("해제");
        }
        catch(Exception e) {
            System.out.println("예외 처리");
            System.out.println("해제");
        }
    }
}
// 매번 해제하려니 귀찮다.