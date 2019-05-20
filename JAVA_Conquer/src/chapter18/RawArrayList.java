package chapter18;

import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		int value = (int)arNum.get(0);
		// int temp = (int)arNum.get(1);
		System.out.println(value);
	}
}
// 숫자, 문자열 모두 다 Object의 후손이므로 ArrayList에 저장할 수 있지만, 요소를 꺼낼 때 캐스팅 필요