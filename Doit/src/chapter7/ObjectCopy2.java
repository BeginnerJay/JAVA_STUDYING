package chapter7;
// 객체 배열의 얕은 복사
// 배열을 복사해 출력하기 전 bookArray 배열 요소 값 하나를 변경해 보자.
public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        System.out.println("=== bookArray1 ===");
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서"); // bookArray1 배열의 첫 번째 element 변경
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo(); // book1 배열 출력
        }


        System.out.println("=== bookArray2 ===");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo(); // bookArray2 배열요소의 값도 변경되어 출력
        }
    }
}
// 객체 배열 요소에 저장된 값은 인스턴스 자체가 아닌 인스턴스 주소값.
// 두 배열의 서로 다른 elements가 같은 instance 를 가리키고 있음.