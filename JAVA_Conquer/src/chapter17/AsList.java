package chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// 대량의 자료를 관리할 때에는 묶음을 한번에 처리하는 벌크 처리가 유리하다.
public class AsList {
	public static void main(String[] args) {
		// publc static <T> List<T>asList(T ...a)
		// 인수 목록에 T 타입의 초기값을 콤마로 구분해 나열하면, 리스트 컬렉션을 생성하여 return한다.
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		// return type이 ArrayList보다 더 상위의 타입인 List<T>여서 ArrayList에 바로 대입할 수 없다.
		// asList로 만든 리스트를, ArrayList의 생성자로 넘겨 초기화하면 된다.
		// ArrayList<Integer> arraylist = new ArrayList<Integer>(list);
		var arrayList = new ArrayList<Integer>(list);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.printf("%d ", arrayList.get(i));
		}
	}
}
