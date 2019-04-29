package chapter11;

public class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    // Book 클래스의 참조 변수를 사용해 책 이름, 책 번호를 toString() 으로 출력(toString() Override)
    @Override
    public String toString() {
        return bookTitle + "," + bookNumber;
    }
    // toString() 메서드를 직접 Override하면 객체의 참조 변수를 이용해 원하는 문자열 표현 가능
}
