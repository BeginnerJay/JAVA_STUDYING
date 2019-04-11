package chapter7;
import java.util.ArrayList; // ArrayList 클래스 import

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>(); // ArrayList 선언
        // 제네릭 자료형 사용
        // 제네릭이란 클래스 내부에서 사용할 자료형을, 후에 인스턴스를 생성할 때에 확정하는 것
        // 객체의 타입을 컴파일 시에 체크하기 때문에, 객체의 타입 안정성을 높이고, 형변환의 번거로움이 줄어든다.
        // ArrayList와 같은 컬렉션 클래스는(다양한 종류의 객체를 담을 수 있기는 하지만)
        // 보통 한 종류의 객체를 담는 경우가 더 많다.
        // 그런데도 꺼낼 때마다 타입 체크를 하고, 형 변환을 하는 것은 불편하다.

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생택쥐페리"));

        for (int i = 0; i < library.size(); i++) { // length() 안쓴다! size() 쓰는 것에 유의
            Book book = library.get(i); // 배열에 추가된 요소 개수만큼 출력
            book.showBookInfo();
        }

        System.out.println("=== Use enhanced for_loop");
        for (Book book : library) {
            book.showBookInfo();
        }
    }
}
/*
기본 배열에서는 [] 안에 배열 전체 길이를 미리 지정해야 했다.
하지만 ArrayList를 생성할 때에는 미리 지정할 필요가 없다.
add() 메서드를 사용해 생성자만 호출하면 된다.
 */