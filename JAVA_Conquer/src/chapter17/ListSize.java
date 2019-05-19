package chapter17;

import java.util.ArrayList;

public class ListSize {
	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++ ) {
			arNum.add((int)(Math.random() * 10));
		}
		for (Integer i : arNum) {
			System.out.print(i + " ");
		}
	}
}
