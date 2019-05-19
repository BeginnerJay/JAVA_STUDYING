package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// ListIterator는 Iterator를 상속받아 기능을 개선한 것.
// 역방향 이동 가능, 순회중 값 변경, 현재 위치 조사 등이 추가로 가능함.
public class ReverseIt {
	public static void main(String[] args) {
		List<String> arName = new ArrayList<String>();
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		
		ListIterator<String> it = arName.listIterator(arName.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
