package chapter17;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> arNum2 =  new ArrayList<Integer>(Arrays.asList(2, 3));
		
		System.out.print("차집합 => ");
		ArrayList<Integer> arNumRemove = new ArrayList<Integer>(arNum); 
		arNumRemove.removeAll(arNum2);
		for (Integer i : arNumRemove) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n교집합 => ");
		ArrayList<Integer> arNumRetain = new ArrayList<Integer>(arNum); 
		arNumRetain.retainAll(arNum2);
		for (Integer i : arNumRetain) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n부분집합 => ");
		if (arNum.containsAll(arNum2)) {
			System.out.print("부분집합임");
		} else {
			System.out.print("부분집합이 아님");
		}
	}
}
