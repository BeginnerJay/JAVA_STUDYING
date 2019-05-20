package chapter18;

import java.util.ArrayList;
// Human과 Student는 부모 자식이지만, ManBox<Human>과 ManBox<Student>는 그렇지 않다.
	// is a 관계도 아니고, 독립적이다.
public class GenSubType {
	public static void main(String[] args) {
		ArrayList<Human> ah = new ArrayList<Human>();
		ArrayList<Student> as = new ArrayList<Student>();

		ah.add(new Human());
		as.add(new Student());
		ah.add(new Student());
		
		//ah = as;
		ah.add(new Human());
		Student k = as.get(1);
	}
}
