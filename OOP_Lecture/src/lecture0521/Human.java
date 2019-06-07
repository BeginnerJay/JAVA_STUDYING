package lecture0521;

public class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return age+"����"+name;
	}
	
	public boolean equals(Human obj) {
		return (age==obj.age && name==obj.name);
	}

}
