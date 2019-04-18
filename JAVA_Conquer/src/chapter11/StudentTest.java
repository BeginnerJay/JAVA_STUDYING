package chapter11;

public class StudentTest {

	public static void main(String[] args) {
		Human humanKim = new Human(26, "김재욱");
		humanKim.intro();

		Student studentKim = new Student(26, "김재욱", 13123313, "경영");
		humanKim.intro();
		studentKim.intro();
		studentKim.study();
		studentKim.display_student();

		Student studentDodo = new Student();
		studentDodo.intro();
		studentDodo.display_student();
	}

}
