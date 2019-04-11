// 객체 배열 만들기(1)
package chapter7;
// 참조 자료형 변수도 여러 개를 배열로 사용할 수 있다.
// 객체 배열은 기본 자료형 배열과 사용 방법이 다르다.
public class Book {
    private String bookName;
    private String author;

    public Book() {
    } // Default Constructor 생성

    public Book(String bookName, String author) { // 책 이름과 저자 이름을 매개변수로 받는 생성자
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showBookInfo() {
        System.out.println(bookName + "," + author); // 책 정보를 출력해 주는 메서드
    }
}
