package chapter18;

public class ManBoxTest {
	public static void main(String[] args) {
		Human h = new Human();
		ManBox<Human> bh = new ManBox<Human>(h);
		bh.intro();

		Student s = new Student();
		ManBox<Human> bs = new ManBox<Human>(s);
		bs.intro();
	}
}
