package chapter17;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		//LinkedList<String> arName = new LinkedList<String>();
		List<String> arName = new LinkedList<String>(); // 상위 타입으로 선언
		// 막상 써보니 바꾸고 싶으면 우측만 변경하면 된다.
		// 메서드로 컬렉션을 전달할 때에도, 가급적이면 인터페이스 타입으로 인수를 전달하자.
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");

		for (String s : arName) {
			System.out.println(s);
		}
	}
}
// ArrayList와 LinkedList는 기능이 유사해서 상호 대체 가능
// 그래서 컬렉션 관련 객체는 구현 클래스의 타입보다 상위인 인터페이스 타입으로 선언이 권장됨.