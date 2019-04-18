package chapter11;

public class StudentTest {

	public static void main(String[] args) {
		Human humanKim = new Human(26, "김재욱");
		humanKim.intro();

		Student studentKim = new Student(26, "김재욱", 13123313, "경영");
		studentKim.intro();
		studentKim.study();
		studentKim.display_student();

		Student studentDodo = new Student();
		studentDodo.intro();
		studentDodo.study();
		studentDodo.display_student();


		// 자식 클래스인 Student는 생성자를 선택할 수 있다.
			// 첫 번째 인수에 따라 불러오는 생성자가 달라진다.
		Student studentCheon = new Student(1994.08f, "천민석", 13549826,"토목공학");
		studentCheon.intro();
		studentCheon.study();
		studentCheon.display_student();
	}

}
