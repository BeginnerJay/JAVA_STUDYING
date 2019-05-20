package chapter18;

public class BoxTest {
	public static void main(String[] args) {
		IntBox bi = new IntBox(1234);
		int biv = bi.getValue();
		System.out.println(biv);

		DoubleBox bd = new DoubleBox(56.78);
		double bdv = bd.getValue();
		System.out.println(bdv);
		
		ObjectBox bo1 = new ObjectBox(1234);
		int bo1v = (int)bo1.getValue();
		System.out.println(bo1v);
		
		ObjectBox bo2 = new ObjectBox(56.78);
		double bo2v = (double)bo2.getValue();
		System.out.println(bo2v);
		
		GenBox<Integer> bg1 = new GenBox<Integer>(1234);
		int bg1v = bg1.get();
		System.out.println(bg1v);
		
		GenBox<Double> bg2 = new GenBox<Double>(56.78);
		double bg2v = bg2.get();
		System.out.println(bg2v);
		
		System.out.println(bg1.getClass() == bg2.getClass());
		
		GenBox rb = new GenBox(1234);
		int rbv = (int)rb.get();
		System.out.println(rbv);
		
		GenBox raw = new GenBox(1234);
		GenBox<Integer> para = new GenBox<Integer>(5678);
		raw = para;
		// para 객체에 저장 가능한 모든 데이터는 raw 객체에도 저장할 수 있다.
		// 그래서 타입이 다르지만 잘 대입되며, 경고도 발생하지 않는다.
		// 단 raw 객체는 타입 정보가 없어 Casting 읽을 때 필요하다.
		int value = (int)raw.get();
		System.out.println(value);
		int value2 = para.get();
		System.out.println(value2); // 경고 발생
		// GenBox 로타입 객체는 변환시 체크할 수 없어 안전하지 않다.
	}
}
// 저장하는 값에 따라 매 타입별로 클래스를 일일히 만드는 것은 불가능하다.
// 이 문제에 대한 과거의 해결책은 Object 타입을 활용하여 임의의 데이터를 저장하는 것이었다.
// 그러나 읽을 때 캐스팅이 필요하고, 실제 저장된 타입과 다르게 캐스팅하면 프로그램이 뻗는다.
// 실 타입 인수가 무엇이든 GenBox<T>의 코드는 딱 하나뿐이다.
// 자바 7부터는 GenBox<Integer> bg1 = new GenBox<>(1234); 로 줄일 수 있다. 단 <>는 생략 불가
// 자바 10부터는 var bg1 = new GenBox<>(1234); 로 쓸 수 있다.

// 하위 호환성을 위해 제네릭 변수에도 타입 인수를 빼고 클래스명만 쓰는 원형 개념을 도입했다.
	// 원형은 타입 인수가 없어, 제네릭 이전 클래스와 같은 특성을 보인다.
	// Object를 저장하며, 값을 읽을 때 캐스팅이 필요하다.