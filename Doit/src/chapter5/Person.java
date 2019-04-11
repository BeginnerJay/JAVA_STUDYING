package chapter5;

public class Person {
	String name;
	float height;
	float weight;
	char gender;
	boolean married;
	int kids;

	public Person( ) {}; // 따로 이렇게 만들지 않아도 생기는 Default 생성자
	// 생성자는 주로 멤버 변수에 대한 값들을 매개변수로 받아서, 인스턴스가 새로 생성될 때 멤버 변수 값을 초기화하는 역할을 한다.
	// 즉 인스턴스가 생성됨과 동시에 멤버 변수의 값을 지정하고, 인스턴스를 초기화하기 위해 -> 생성자를 직접 구현해 사용한다.
	// 프로그래머가 생성자를 직접 추가하면 디폴트 생성자는 만들어지지 않는다.
	// -> 디폴트 생성자 불러오는 명령어 쓰면 에러. -> 매개변수 있는 생성자로 호출하거나, 디폴트 생성자 구현해준다.
	// 매개변수가 있는 생성자를 추가한다고 해서 꼭 디폴트 생성자를 추가로 작성해야 하는 것은 아니다.
	// ex) 학번이 꼭 있어야 한다! -> 학번을 넣어 주는 생성자만 작성
	public Person(String pname) {
		name = pname; // 사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
		// 이제 Person 클래스를 생성할 때에 두 생성자 중 하나르 선택해 사용할 수 있다.
		// 하나는 아무 것도 설정되지 않은 인스턴스 생성, 다른 하나는 이름이 미리 지정된 인스턴스 생성
		// 이렇게 클래스에 생성자가 두 개 이상 제공되는 경우를 생성자 오버로드라고 한다.
	}
	public Person(String pname, float pheight, float pweight){
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
