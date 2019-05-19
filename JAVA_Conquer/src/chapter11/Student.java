package chapter11;
// 상속받을 때에 동작 자체는 상속받지만, 동작하는 방식을 약간 다르게 할 수 있다.
// 자식이 부모의 메서드를 수정하는 것을 메서드 재정의(Overriding)이라고 한다.
class Student extends Human {
	private int stnum;
	private String major;

	Student(int age, String name, int stnum, String major) {
		super(age, name);
		setStnum(stnum);
		setMajor(major);
	}

	Student(float birth, String name, int stnum, String major) {
		super(birth, name);
		setStnum(stnum);
		setMajor(major);
	}


	Student() {
		super();
		stnum = 999;
		super.setName("김도도");
		super.setAge(20);
		major = "컴퓨터공학과";
	}
	// 어차피 초기화에 필요한 모든 인수를 다 전달받았고, 모든 멤버를 상속받았다.
	// 그러무로 굳이 super의 생성자를 호출할 필요 없이 직접 대입해도 될 것 같다.
	// Student 생성자에서 age와 name을 직접 대입해도 별 문제가 없으며, 잘 초기화된다.
	// 그러나 코드가 중복되고, 나중에 두 곳을 수정하기 귀찮으므로 상속하는 것이 합리적이다.
	// 자식 클래스에서 부모의 생성자를 호출할 때에는 반드시 첫 줄에서 호출해야 한다.


	public void setStnum(int stnum) {
		this.stnum = stnum;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	void display_student() {
		System.out.println("이름 : " + super.getName());
		System.out.println("전공 : " + major);
	}

	void study() {
		System.out.println("하늘 천 따 지 검을 현 누를 황");
	}

	// 사람은 몇살 누구라고 소개하지만, 학생은 학번과 전공이라는 정보도 있다.
	// intro method는 Human에도, Student에도 잇다.
		// 자식이 부모의 메서드와 같은 이름으로 메서들르 다시 정의하면, 자식 객체에 대해서는 재정의한 메서드가 호출된다.
	// 부모와 동작이 조금이라도 다르다면 어떤 메서드이든 재정의할 수 있다.
	// 생성자와 달리 super.intro()를 나중에 호출해도 상관없다.
	@Override
	void intro() {
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + stnum);
		System.out.println("*****************");
		super.intro();
	}
}
// 재정의 조건
// 재정의는 부모가 이미 정의한 메서드의 동작을 자식 클래스에 맞게 다시 정의하여 수정하는 것이다.
	// 같은 메서드를 다시 만드는 거라 간단 -> 하지만 몇 가지 조건이 있다.
	// 1. 부모의 메서드와 같은 시그니처로 자식의 메서드를 정의한다.
		// 메서드 이름, 인수 목록이 완전히 일치해야 한다.
		// 인수 목록이 다르거나, 대소문자가 일치하지 않으면 재정의가 아니라 별도의 메서드를 추가한 것이다.
	// 2. 오버로딩과 달리 오버라이딩은 리턴 타입도 완전히 일치해야 한다.
		// 리턴값이 다르면 호출 후의 처리가 달라 일관성이 없어진다.
	// 3. 액세스 지정자는 보통 유지한다. 바꿀 경우 정보를 더 공개하는 것만 가능하다.
		// 이런 규칙이 있는 이유는 다형성 때문이다.
			// 부모 타입의 변수로 호출 가능한 메서드는 자식 객체에서도 언제나 호출 가능해야 한다.
				// 반대는 성립하지 않는다.
				// 즉 부모가 숨겨 놓은 메서드를 자식이 공개하는 것은 가능하다.
				// (타입 캐스팅과 관련) -> 다형성까지 공부 후 다시 이해
	// 4. 부모의 메서드가 지정한 예외는 재정의한 메서드도 똑같이 지정해야 한다.
		// 예외를 배운 후에 다시 살펴보자.
	// 즉 오버라이딩 할때에는 메서드 이름, 인수 목록, 액세스 지정자, 예외 목록 등을 정확히 맞추어야 한다.
// @Override는 재정의한 메서드임을 분명히 하고, 시그니처가 일치하는지 감시해 준다.
