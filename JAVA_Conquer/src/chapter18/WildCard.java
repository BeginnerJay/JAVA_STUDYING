package chapter18;

public class WildCard {
	public static void main(String[] args) {
		Human h = new Human();
		ManBox<Human> bh = new ManBox<Human>(h);
		PrintMan.printMan(bh);

		Student s = new Student();
		ManBox<Student> bs = new ManBox<Student>(s);
		PrintMan.printMan(bs);
	}
}
