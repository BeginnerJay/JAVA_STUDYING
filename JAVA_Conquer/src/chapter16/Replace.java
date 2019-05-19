package chapter16;

public class Replace {
	public static void main(String[] args) {
		String str = "독도는 일본땅이다. 대마도는 일본땅이다.";
		System.out.println(str.replace("일본", "한국"));
		System.out.println(str.replaceFirst("일본", "한국"));
	}
}
