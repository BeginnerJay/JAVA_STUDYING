package chapter16;

public class AtoZ2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				str.append(ch);
			}
			str.append('\n');
		}
		System.out.println(str);
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "초");
	}
}
/*
 * StringBuffer append(char c)
 * StringBuffer insert(int offset, String str)
 * StringBuffer delete(int start, int end)
 * StringBuffer replace(int start, int end, String str)
 */
// String과 StringBuffer는 직접 대입할 수 없으며, 변환을 거쳐야 한다.
// String 객체를 StringBuffer로 바꾸려면 StringBuffer의 생성자로 전달한다.
// StringBuffer 객체를 String으로 바꾸려면 toString() 메서드를 호출한다.