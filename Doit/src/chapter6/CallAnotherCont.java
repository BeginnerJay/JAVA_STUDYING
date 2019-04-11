package chapter6;
// this를 사용하여 주소 값 반환하기

class Person2 {
	String name;
	int age;

	Person2() {
		this("이름 없음", 1);
	}

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person2 returnItSelf() { // 반환형은 클래스형( 클래스를 반환하는 메서드)
		return this; // this 반환
	}
}

public class CallAnotherCont {
	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person2 p = noName.returnItSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p); // noName.returnIlSelf()의 반환값 출력
		System.out.println(noName); // 참조 변수 출력
	}

}
// this를 반환하는 메서드를 사용할 일이 흔하지는 않다.
// 클래스 자료형과 상관없이, 클래스 내에서 this를 사용하면 자신의 주소값을 반환할 수 있다.