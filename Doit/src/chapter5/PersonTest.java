package chapter5;

public class PersonTest {
	public static void main(String[] args) {
		Person man1 = new Person();
		man1.name = "James";
		man1.gender = 'M';
		man1.married = true;
		man1.kids = 3;
		System.out.println(man1);
		System.out.println(man1.name);
		System.out.println(man1.gender);
		System.out.println(man1.married);
		System.out.println(man1.kids);

		Person personLee = new Person(); // Person()이 생성자.
		// 생성자는 클래스를 처음 만들 때 멤버 변수나 상수를 초기화하는 역할을 한다.
		Person personKim = new Person("김재욱", 175, 75);
	}
}
