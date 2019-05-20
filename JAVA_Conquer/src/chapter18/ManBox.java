package chapter18;

public class ManBox<T extends Human> {
	T value;
	ManBox(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
	void intro() {
		value.intro();
	}
}
// 바운드 타입은 & 기호로 구분하여 여러 클래스나 인터페이스에 대해 지정할 수 있따.
	// 클래스가 목록의 제일 처음에 와야 한다.
// <T extends A&B&C> <- A 클래스 또는 그 후손 클래스가 B, C 인터페이스 지원해야만 T로 전달이 된다.