package chapter6;

class Person {
	String name;
	int age;

	Person() {
		this("이름 없음", 1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
/* Person 클래스에는 default Constructor와 Parameter 가지는 Person(String,int) Constructor 있다.
 * 클래스가 생성될 때 Person(String, int)가 호출되어 이름과 나이를 전달받고,
 * 디폴트 생성자가 호출되는 경우에는 초깃값으로 이름없음과 1 값을 대입하고자 한다.
 * 디폴트 생성자 코드 안에서 직접 써도 되지만,
 * 이미 다른 생성자에 이 코드가 작성되어 있으므로
 * this를 활용하여 다른 생성자를 호출할 수 있다.
 *
 * 주의 : this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없다.
 * 생성자는 클래스가 생성될 때 호출되므로, 클래스 생성이 완료되지 않은 시점에 다른 코드 있으면 오류 가능
 * 즉 디폴트 생성자에서 생성이 완료되는 것이 아니라
 * this를 사용해 다른 생성자를 호출하는 것이므로
 * this를 활용한 문장이 가장 먼저 오고 그 후에 다른 생성자 문장이 온다.
 */
