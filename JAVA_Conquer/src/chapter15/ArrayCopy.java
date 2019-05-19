package chapter15;
// 배열 요소를 복사라혀면, 원하는 부분에 대해 루프를 돌며 요소끼리 직접 대입하는 것이 원론적.
// System 클래스는 더 효율적인 배열 복사 메서드를 제공한다.
// 이 메서드는 배열 전체 또는 일부를 고속으로 복사한다.
// void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
// parameter는 순서대로 원본, 원본 시작 위치, 대상, 대상 시작 위치, 길이
public class ArrayCopy {

	public static void main(String[] args) {
		int[] ar = { 1,2,3,4,5 };
		int[] ar2 = new int[5];
		
		System.arraycopy(ar, 0, ar2, 0, ar.length);
		
		for (int i : ar2) {
			System.out.print(i + " ");
		}

	}

}
