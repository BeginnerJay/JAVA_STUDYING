package chapter16;
import java.util.Arrays;
import java.util.List;
/*
 * static String join(CharSequence delimiter, CharSequence... elements)
 * 첫 번쨰 인수는 구분자, 두 번쟤 인수는 각각의 문자열 혹은 문자열 컬렉션
 * static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
 */
public class Join {
	public static void main(String[] args) {
		String path = String.join("/", "user", "data", "app", "local");
		System.out.println(path);
		
		String seoul = "서울", daejun = "대전", daegu = "대구", busan = "부산";
		String city = String.join(",", seoul, daejun, daegu, busan);
		//String city = seoul + "," + daejun + "," + daegu + "," + busan;
		System.out.println(city);
		
		List<String> subway = Arrays.asList("서울역", "남영", "용산", "노량진");
		System.out.println(String.join(" -> ", subway));
	}
}
// + 연산자로 끼워 넣는 것보다 편하다.