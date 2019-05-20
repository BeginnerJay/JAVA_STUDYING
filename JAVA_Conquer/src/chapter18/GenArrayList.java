package chapter18;

import java.util.ArrayList;
// 제네릭은 클래스를 인수화
	// 임의의 타입에 대해 동작하는 일반적인 알고리즘을 구현한다.

public class GenArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		//arNum.add("문자열");
		int value = arNum.get(0);
		System.out.println(value);
	}
}
// 컬렉션에 어떤 데이터가 저장될지 컴파일 타임에 미리 알 수 있어 잘못된 타입을 애초에 허용 않음.