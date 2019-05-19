package chapter15;
import java.util.*;
// 원본 배열과 길이를 주면 배열 전체를 복제하고, 시작 끝 위치를 주면 일부만 복제한다.
public class CopyOf {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		int[] ar2 = Arrays.copyOf(ar, ar.length);
		for (int a : ar2) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		int[] ar3 = Arrays.copyOfRange(ar, 1, 3);
		for (int a : ar3) {
			System.out.print(a + " ");
		}
	}
}
