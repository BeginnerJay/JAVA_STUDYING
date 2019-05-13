package chapter14;
// 프로그램이 예외가 발생하여 종료되는 경우를 try-with-resources문으로 구현
public class AutoCloseObjTest {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try(AutoCloseObj obj2 = obj) {
            // 자바 8까지는 AutoCloseable 인터페이스를 구현한 리소스의 변수 선언을 try문 괄호 안에서 해야 했다.
            // 그래서 리소스가 외부에 선언되고 생성된 경우에도, 다른 참조 변수로 괄호 안에서 다시 선언해야 했다.
            // 자바 9부터는 try문 괄호 안에서 외부에서 선언한 변수를 쓸 수 있다.
            // try(Autocloseobj obj2 = obj)를 try(obj)로 간단하게 선언 가능!
            throw new Exception(); // 프로그램에서 강제로 예외를 발생시키는 구문
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
