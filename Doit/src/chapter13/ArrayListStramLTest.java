package chapter13;
// forEach() 메서드는 내부적으로 반복문이 수행한다. -> 요소가 하나씩 차례로 변수에 대입하고,
    // 이를 parameter로 받아 출력문이 호출된다.
// forEach() 메서드가 수행되면서 자료가 소모됨 -> 스트림 새로 생성 필요
// sorted() 메서드를 사용하려면, 정렬 방식에 대한 정의가 필요하다 -> 사용하는 자료 클래스가 Comparable 구현 필요.
// 구현되지 않았다면 Comparator 인터페이스를 구현한 클래스를 지정할 수 있다.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStramLTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream(); // 스트림 생성
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));
        //스트림 새로 생성.정렬.요소를 하나씩 꺼내어 출력
    }
}
