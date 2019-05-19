package chapter17;
// LinkedList는 항상 링크를 따라 이동하기 때문에 느리다.
// 반복자는 마지막 읽은 위치를 내부적으로 저장해 두고, 이 정보를 이용해 다음 요소를 빠르게 찾는다.
// 또한 LinkedList와 ArrayList의 액세스 방식을 통일 -> 일관된 코드로 자료 관리 가능.
// 모든 컬렉션은 Iterable interface 구현
	// Iterator<E> iterator() 메서드로 반복자를 구한다.
// boolean hasNext() 다음 요소가 있는지 조사한다
// E next() 다음 요소를 읽는다
// void remove() next로 읽은 요소를 삭제한다

import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> arName = new LinkedList<String>();
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		// 반복자는 컬렉션의 액세스 방식을 표준화한다.
		Iterator<String> it = arName.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
