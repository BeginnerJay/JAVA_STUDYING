package chapter18;

import java.util.ArrayList;

public class DumpArray {
	// ArrayList<T> 타입을 전달받아 콘솔로 덤프한다.
	static <T> void dumpArray(ArrayList<T> arrayList) {
		for (T a : arrayList) {
			System.out.println(a);
		}
	}
}
