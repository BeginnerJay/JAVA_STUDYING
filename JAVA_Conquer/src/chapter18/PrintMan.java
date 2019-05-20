package chapter18;
// 제네릭의 서브 타입 관계가 복잡하고 제액이 많아 좀 더 유연한 타입이 필요하다.
// ManBox<Human>과 ManBox<Student>처럼 상속관계가 아닌 둘을 모두 받을 수 있는 메서드가 필요하다묜
// <? extends Human> <- Human으로부터 파생된 임의의 타입
// <? super child> <- child의 모든 부모 타입(Object까지) 올 수 있다.
// <?> <- Object의 기능만 사용하거나, 타입 인수의 기능을 전혀 필요치 않는 경우에 사용한다.
public class PrintMan {
	static void printMan(ManBox<? extends Human> box) {
		box.get().intro();
	}
}
