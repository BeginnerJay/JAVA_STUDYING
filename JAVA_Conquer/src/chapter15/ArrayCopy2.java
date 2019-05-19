package chapter15;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = new int[5];
		
		System.arraycopy(ar, 1, ar2, 2, 2);
		
		for (int a : ar2) {
			System.out.print(a + " ");
		}
	}
}
// ar 배열의 1번째부터, ar2의 2번째 요소 위치로 딱 2개의 요소만 복사