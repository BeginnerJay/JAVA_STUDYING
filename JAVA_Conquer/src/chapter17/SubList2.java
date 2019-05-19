package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubList2 {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		List<Integer> sub = arNum.subList(1, 4);
		arNum.remove(2);
		for (Integer i : sub) {
			System.out.print(i + " ");
		}
	}
}
// 원본에 대해 1 ~ 4 범위의 뷰를 생성해 놓고, 원본의 2번째 요소를 제거하면 원본이 뷰 생성 시점과 다름
// 뷰는 무효가 되며, 이 상태에서 뷰를 참조하면 ConcurrentModificationException 예외 발생.