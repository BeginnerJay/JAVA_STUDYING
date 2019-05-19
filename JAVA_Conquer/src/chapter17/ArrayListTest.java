package chapter17;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//ArrayList<Integer> arNum = new ArrayList<Integer>();
		var arNum = new ArrayList<Integer>(); // java 10부터
		// 원래 기본형을 저장하려면 래퍼 클래스로 박싱 필요
		// arNum.add(New Integer(1));
		// 자동 박싱을 해 준다.
		arNum.add(1);
		arNum.add(2);
		arNum.add(3);
		arNum.add(4);
		arNum.add(5);
		arNum.add(2, 100); // arNum[2]에 끼어들고, 원래 2부터 한 칸씩 밀어낸다.
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}
