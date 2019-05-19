package chapter15;

public class InsertionSortTest {
	public static void main(String args[]) {
		final int num = 300000;
		long start = System.currentTimeMillis();
		byte ar[] = new byte[num];
		for (int i = 0; i < num; i++) {
			ar[i] = (byte) (Math.random() * 255);
		}
		InsertionSort.insertionSort(ar, num);
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0 + " 초 걸림");
	}
}
