package chapter17;

import java.util.ArrayList;
import java.util.Collections;

// Collections(Collection이 아님)클래스는 컬렉션에 적용되는 일반적인 알고리즘 메서드 제공.
// 정적 메서드 -> 객체 생성 불필요.
// static <T extends Comparable<? super T>> void sort(List<T> list)
// static <T> void sort(List<T> list, Comparator<? super T> c)
public class SortList {
	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>(); 
		arName.add("장보고");
		arName.add("김유신"); 
		arName.add("강감찬"); 
		arName.add("을지문덕"); 
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		Collections.sort(arName);
		// 역순정렬
		// Collections.reverse(arName);
		// 별도의 비교 객체를 만들어 전달하는 것보다 간단하다.
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
	}
}
