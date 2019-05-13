package chapter14;
// 예외 클래스를 직접 만들어 예외를 발생시키고, 예외 처리 코드를 구현하기
public class IDFormatException extends Exception{
    public IDFormatException(String message) { // 생성자의 매개변수로 예외 상황 메시지를 받음.
        super(message);
    }
}
