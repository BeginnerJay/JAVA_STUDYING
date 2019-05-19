package chapter16;
// String[] split(String regex, [int limit])
// parameter는 순서대로 구분자를 표현하는 정규식/ 추출할 갯수
public class Split {
	public static void main(String[] args) {
		String city = "서울,대전,대구,부산";
		String[] token = city.split(",");

		for (String s : token) {
			System.out.println(s);
		}
	}
}
