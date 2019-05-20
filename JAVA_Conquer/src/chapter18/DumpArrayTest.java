package chapter18;

import java.util.ArrayList;

public class DumpArrayTest {
	public static void main(String[] args) {
		ArrayList<String> yoil = new ArrayList<String>();
		yoil.add("일요일");
		yoil.add("월요일");
		DumpArray.<String>dumpArray(yoil);
		// 인수로 받을 배열의 요소 타입이 제각각이어서, 타입 인수가 필요하다.
		// 호출할 때 어떤 타입의 배열인지 밝혀야 한다.
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(98);
		score.add(72);
		DumpArray.<Integer>dumpArray(score);
	}
}
