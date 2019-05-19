package chapter17;

import java.util.HashSet;
import java.util.Iterator;

// Set은 순서 없고 중복도 없다.
// 저장 메서드 실행해도 집합에 없는 데이터만 저장한다.
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> kangwon= new HashSet<String>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");
		
		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
