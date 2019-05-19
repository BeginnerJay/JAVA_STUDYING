package chapter16;
// String 클래스는 빈번하게 변경할 때에는 성능이 떨어진다.
// 이럴 때 쓰는 별도의 클래스가 StringBuffer이다.
public class AtoZ {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch ++) {
				str += ch;
			}
			str += '\n';
		}
		System.out.println(str);
		System.out.println((System.currentTimeMillis()-start)/1000.0 + "초");
	}
}
