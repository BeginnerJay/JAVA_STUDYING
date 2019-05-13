package chapter14;
// try-with-resources문으로 close()메서드를 명시적으로 호출하지 않아도 자동으로 리소스 닫을 수 있음.
// 쓰려면 해당 리소스가 AutoCloseable 인터페이스 implement 해야한다.
// AutoCloseable interface implement한 클래스 뭐 있는지 궁금? Javadoc 찾아보자.
public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
