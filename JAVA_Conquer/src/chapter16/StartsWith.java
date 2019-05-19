package chapter16;
// 앞부분과 뒷부분이 특정 문자열인지 조사하여 진위형 값을 return한다.
// boolean startswith(String prefix)
// boolean endsWith(String suffix)
public class StartsWith {
	public static void main(String[] args) {
		String[] files = {
				"girl.jpg",
				"boy.png",
				"child.avi",
				"school.jpg",
				"book.gif"
		};
		
		for (String s : files) {
			if (s.endsWith(".jpg")) {
				System.out.println(s);
			}
		}
	}
}
