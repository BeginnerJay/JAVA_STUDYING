package chapter14;
// try-with-resources 사용하기
public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoCloseObj obj = new AutoCloseObj() /* 사용할 리소스 선언 */) {

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 부분입니다");
        }
    }
}
// 정상적으로 프로그램이 종료되는 경우.