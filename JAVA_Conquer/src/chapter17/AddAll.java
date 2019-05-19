package chapter17;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAll {
	public static void main(String[] args) {
		ArrayList<Integer> arNum =  new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> arNum2 =  new ArrayList<Integer>(Arrays.asList(4, 5, 2));
		// addAll 메서드는 합집합을 만든다.
		arNum.addAll(arNum2);
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}
