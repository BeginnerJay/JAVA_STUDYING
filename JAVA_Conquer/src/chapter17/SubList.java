package chapter17;

import java.util.*;
// List<E> subList(int fromIndex, from toIndex)
// 다음 메서드는 배열의 일부로 서브 배열을 생성한다.
// returned subList는 원본 배열을 보여주는 View 역할을 하며, 뷰를 통해 원본을 읽거나 변경 가능.
// 뷰는 사본이 아니라 원본을 가리키고 있는 상태여서, 원본이 바뀌면 같이 바ㅜ낀다.
// 뷰의 특성을 이용하면 원본 뷰에 대한 범위 연산을 편리하게 수행 가능.
// 일정 범위의 요소를 제거하고 싶다면, 해당 범위를 가리키는 뷰를 만든 후, clear 메서드 사용하자.
// 일부 메서드는 범위에 대한 지정을 할 수 없어, 항상 전체 컬렉션을 대상으로 한다.
	// 이런 메서드를 사용할 때 뷰를 써 주면 범위를 지정할 수 있다.
// 뷰는 원본의 일부를 보여주는 것 뿐으로, 요소가 바뀌는 것은 상과없지만, 원본의 구조는 불변이여야.
// 뷰가 가리키고 있는 원본의 요소가 추가되거나 변경되면 뷰는 무효가 되며,
	// 이 상태에서 뷰를 참조하면 예외가 발생한다.

public class SubList {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		List<Integer> sub = arNum.subList(1, 4);
		for (Integer i : sub) {
			System.out.print(i + " ");
		}
		System.out.println();

		arNum.set(2, 100);
		for (Integer i : sub) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		sub.set(1, 200);
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		sub.clear();
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}
