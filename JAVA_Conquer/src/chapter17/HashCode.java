package chapter17;
// 해시는 데이터의 고유값, 어느 버ㅣ킷에 데이터 저장할 것인지 결정한다.
// 객체의 값이 같다면 같은 해시 리턴해야 하지만, 주소가 다르면 다른 해시가 리턴된다.
// hashCode 메서드를 재정의함으로써 해결할 수 있다.
import java.util.HashMap;

public class HashCode {
	public static void main(String[] args) {
		HashMap<Human,Integer> donate = new HashMap<Human,Integer>();
		donate.put(new Human(42, "김기남"), 10000);
		donate.put(new Human(24, "박수빈"), 20000);
		donate.put(new Human(20, "박수현"), 5000);
		donate.put(new Human(11, "최상미"), 8000);

		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
	}
}
