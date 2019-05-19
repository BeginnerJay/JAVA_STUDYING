package chapter17;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArray {
	// 컬렉션은 편리하지만 일반 배열보다 크고 무겁다.
	// 단순히 값의 집합만 표현하려면 일반 배열로 변환해준다.
	// 이 때 toArray메서드를 사용한다.
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(12, 34, 56));
		/*
		Integer[] ar = new Integer[arNum.size()]; 
		arNum.toArray(ar);
		*/
		// integer[] ar = arNum.toArray(new Integer[0]);
		// 배열 할당 및 변환을 한 줄로 처리해도 결과는 같다.
		
		var ar = arNum.toArray(new Integer[0]);
		
		for (int a : ar) {
			System.out.print(a + " ");
		}
	}
}
// 실행 중에 배열을 할당하면 성능에 불리 -> 미리 할당 필요.
// 배열이 컬렉션보다 클 경우 굳이 줄이지는 않고, 남는 요소를 null로 채운다.