package chapter16;
// 앞쪽이나 뒷쪽의 시작 방향에 따라 검색 메서드를 선택하며, 두 번째 옵션 인수로 검색 시작 위치 지정
// 시작 위치를 생략하면 처음부터 또는 끝에서부터 검색 시작.
// 검색한 위치가 발견되지 않으면 -1을 return한다.
/*
 * int indexOf(int ch[,int fromIndex])
 * int lastIndexOF(int ch[,int fromIndex])
 * int indexOf(String str[,int fromIndex])
 * int lastIndexOf(String str[,int fromIndex])
 */
public class IndexOf {
	public static void main(String[] args) {
		String str = "String Search Method of String Class";
		
		System.out.println("앞쪽 t = " + str.indexOf('t'));
		System.out.println("뒤쪽 t = " + str.lastIndexOf('t'));
		System.out.println("앞쪽 z = " + str.indexOf('z'));
		System.out.println("앞쪽 String = " + str.indexOf("String"));
		System.out.println("뒤쪽 String = " + str.lastIndexOf("String"));
	}
}
// 뒤쪼에서부터 찾더라도, 리턴되는 검색 위치는 항상 앞에서부터의 순서값이다.