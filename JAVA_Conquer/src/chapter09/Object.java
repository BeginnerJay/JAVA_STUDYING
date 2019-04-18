package chapter09;

class Object {

	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도 C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		// new 연산자로 객체를 새로 만들고 속성만 대입해서 찍어내기 가능.
		Car equus = new Car();
		equus.name = "에쿠스";
		equus.gasoline = true;
		System.out.print(equus.name + " : ");
		equus.run();

	}

}
// 클래스로부터 생성된 객체를 인스턴스라고 부른다.
// korando, equus 객체는 Car 타입의 변수로 생성, int 타입에서 score 선언하는 것과 같다.
// int로부터 얼마든지 많은 정수 선언 가능 -> Car로부터 무수히 많은 자동차 가능.

// 필드와 메서드도 변수, 함수와 사용법은 거의 유사. 하지만 클래스에 소속되어 있는데서 오는 약간의 차이 有
// 지역 변수
	// 메서드가 종료되면 사라진다.
	// 별도의 초기식이 없을 시 쓰레기 값을 갖는다.
	// 지정자를 붙일 수 없다.
// 멤버 변수
	// 소속된 객체가 존재하는 동안 계속 값을 유지한다.
	// 별도의 초기식이 없을 때 기본값(0, false, null)으로 초기화된다.
	// access modifier로 숨길 수 있고, static으로 선언하면 모든 객체가 공유할 수 있다.

// 생성자의 특수성(일반 메서드와 비교하여)
	// 생성자는 객체 생성시에 new 연산자에 의해 자동으로 호출된다.
		// 컴파일러가 생성자 찾으려면 이름 고정 필요 -> 그래서 클래스 이름과 같은 이름 쓴다.
	// 초기화만 하므로 return값 없다. void라고 쓸 필요도 없다.
	// 객체를 생성할 때 단 한 번만 호출할 수 있다.
	// 객체 생성시 외에 생성자를 직접 호출할 수 있는 방법은 없다.
		// 예외적으로 생성 중에 생성자끼린 상호 호출 가능하다.
	// 생성자는 해당 클래스만을 위해 존재하므로, 자식 클래스에게 상속되지 않는다.
	// 그러므로 생성자는 메서드라고 부르지 않으며, 클래스 다이어그램을 그릴 때 따로 그린다.