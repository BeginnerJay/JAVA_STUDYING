package chapter18;
// 타입 안정성을 향상시키기 위해 도입된 것이 제네릭이다.
public class GenBox<T> {
	T value;
	GenBox(T value) { this.value = value; }
	T get() { return value; }
	void set(T value) { this.value = value; }
}
