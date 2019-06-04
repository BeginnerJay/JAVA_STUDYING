
public class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return age+"¼¼ÀÇ"+name;
	}
	
	public boolean equals(Human obj) {
		return (age==obj.age && name==obj.name);
	}

}
