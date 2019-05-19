package chapter15;
// 아무나 객체의 사본을 뜨는 것은 보안상 위험할 수 있으니, 클래스 제작자가 사본 작성을 허용해야 한다.
// 사본 작성이 가능한 클래스라는 것을 분명히 표시하기 위해 Cloneable 인터페이스를 상속받았다.
// Object의 clone 메서드는, 클래스가 Cloneable 인터페이스를 구현하지 않으면 예외를 던진다.
class Human implements Cloneable{
	int age;
	String name;
	int[] score = new int[] { 1, 2, 3};
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
    }
    
    @Override
    public String toString() {
		return age + "세의 " + name;
    }
    
    @Override
    public Object clone() {
    	try {
			// return super.clone(); // 앝게 복사된다.
			Human other = (Human)super.clone();
			other.score = this.score.clone();
			return other;
			// 객체의 사본을 먼저 뜨고 score 멤버에 대해 별도의 배열을 더 만들었다.
			// 이렇게 사본을 뜨면 메모리에는 두 객체가 완전히 분리된다.
		} catch (CloneNotSupportedException e) {
			return null;
			// TODO: handle exception
		}
    	// return new Human(age, name);
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

    void intro() {
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
    }
    // 클래스마다 필드 목록이 고유하고, 상등성을 비교하는 방법이 달라, equals 메서드도 클래스마다 각각 정의해야 한다.
}