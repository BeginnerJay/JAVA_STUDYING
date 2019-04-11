package chapter7;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // Book 클래스형으로 객체 배열 생성
        //이 코드의 내용만 보면 Book 인스턴스 5개가 생성된 것처럼 보인다.
        // 하지만 Book 인스턴스 5개가 바로 생성된 것이 아니라,
        // 각각의 인스턴스 주소 값을 담을 공간 5개를 생성하는 문장.

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
