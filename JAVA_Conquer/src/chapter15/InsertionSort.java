package chapter15;

public class InsertionSort {
	static void insertionSort(byte ar[], int num) {
		int i, j;
		byte temp;
		for (i = 1; i < num; i++) {
			for (temp = ar[i], j = i; j > 0; j--) {
				if (ar[j - 1] > temp) {
					ar[j] = ar[j - 1];
				} else {
					break;
				}
			}
			ar[j] = temp;
			if (i % 10000 == 0) {
				System.out.println(i + "번째 정렬 중");
			}
		}
	}
}
