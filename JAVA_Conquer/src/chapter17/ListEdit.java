package chapter17;

import java.util.ArrayList;

public class ListEdit {
	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>();
		arName.add("전두환");
		arName.add("김영삼");
		arName.add("김대중");
		arName.add(1,"노태우");
		for (String s : arName) {
			System.out.println(s);
		}

		System.out.println("==========");
		arName.remove(2);
		arName.set(2,"원더걸스");
		for (String s : arName) {
			System.out.println(s);
		}
		// indexOf는 이 요소가 발견되는 위치를 return한다.
		if (arName.indexOf("노태우") != -1) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
	}
}
