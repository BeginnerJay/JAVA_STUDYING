package chapter16;
// 정규식을 사용하여 더 복잡한 치환을 처리할 수 있다.
public class SubString {
	public static void main(String[] args) {
		String str = "0123456789";
		System.out.println(str.substring(3,7));
		
		String name = "제 이름은 <김한결>입니다.";
		int st, ed;
		st = name.indexOf('<');
		ed = name.indexOf('>');
		System.out.println(name.substring(st+1,ed));
	}
}
