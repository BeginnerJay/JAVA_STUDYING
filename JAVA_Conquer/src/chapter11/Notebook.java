package chapter11;
// 상속과 포함

// 부모 자식 관계를 IS A 관계라고 한다.
// 상속 외에도 클래스를 재활용하는 방법 -> 포함.
	// 포함은 한 클래스의 객체를 다른 클래스의 멤버로 선언하여, 객체끼리 중첩하는 기법이다.
	// 필드의 타입에 제한이 없음 -> 객체도 다른 클래스의 필드(멤버 변수)가 될 수 있다.
	// 클래스가 객체를 소유한다고 해서 HAS A 관계라고 한다.

public class Notebook {
	String CPU;
	int memory;
	int storage;

	Notebook(String CPU, int memory, int storage) {
		this.CPU = CPU;
		this.memory = memory;
		this.storage = storage;
	}

	void printSpec() {
		System.out.printf("CPU : %s, Memory : %d바이트, Storage : %d바이트\n",CPU, memory, storage);
	}
}
