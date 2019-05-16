package chapter15;

class Human {
	int age;
	String name;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
    }
    
    @Override
    public String toString() {
		return age + "세의 " + name;
    }
    
    @Override
    public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human)obj;
			return (age == other.age && name.equals(other.name));
		} else {
			return false;
		}
    }
    // 클래스마다 필드 목록이 고유하고, 상등성을 비교하는 방법이 달라, equals 메서드도 클래스마다 각각 정의해야 한다.
}