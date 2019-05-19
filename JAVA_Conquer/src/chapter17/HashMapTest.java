package chapter17;

import java.util.HashMap;

// Map 인터페이스를 HashMap 클래스로 구현한다.
// HashMap<K, V> 키의 타입, 값의 타입
// 정수를 키로 하여 문자열 데이터를 저장한다면 HashMap<Integer, String>이라고 쓴다.
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,Integer> Snack = new HashMap<String,Integer>();
		Snack.put("오징어 땅콩", 2500);
		Snack.put("죠리퐁", 1900);
		Snack.put("핫브레이크", 450);
		Snack.put("빼빼로", 900);
		
		String MySnack = "죠리퐁";
		System.out.println(MySnack + "의 가격은 " + Snack.get(MySnack));
	}
}
