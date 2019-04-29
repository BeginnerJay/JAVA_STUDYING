package chapter11;
// Object 클래스는 모든 자바 클래스의 최상위 클래스이다.
// 모든 클래스가 Object 클래스 상속받음
    // Object의 메서드 사용 가능, 오버라이드 가능, Object로 형변환도 가능

// toString() 메서드는 인스턴스 정보를 문자열로 반환하는 메서드
// Object 클래스의 toString() 메서드 사용하기
public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");

        System.out.println(book1); //인스턴스 정보(클래스 이름, 주소 값)
        System.out.println(book1.toString());
        // toString() 메서드로 인스턴스 정보(클래스 이름, 주소 값)을 보여 줌.
    }
}
// String, Integer 클래스에서는 왜 출력 결과가 클래스 이름@해시값이 아닐까?
    // String과 Integer 클래스에서는 toString() 메서드를 미리 재정의해 두었기 때문이다.
// Book 클래스의 참조 변수를 사용해 책 이름, 책 번호를 toString() 으로 출력(toString() Override)