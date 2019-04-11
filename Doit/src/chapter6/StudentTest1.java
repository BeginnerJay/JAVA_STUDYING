// static 변수 테스트하기
package chapter6;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지은");
		System.out.println(studentLee.serialNum); // serialNum 변수의 초깃값 출력
		// The static field Student.serialNum should be accessed in a static way 경고가 출력된다.
		studentLee.serialNum++;

		Student studentSon = new Student();
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
/*
StudentLee 인스턴스를 먼저 생성하고,
이 참조 변수를 이용하여 전체 인스턴스에서 공통으로 사용하는
serialNum 변수 값을 1 증가시킨다.

static으로 선언한 serialNum 변수는 모든 인스턴스가 공유하기 때문에, 두번째로 출력한
sysout(studentLee.serialNum)는 1001이 출력된다.
*/