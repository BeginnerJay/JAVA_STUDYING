package chapter6;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지은");
		// System.out.println(Student2.serialNum); private라서 에러난다
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName+" 학번 : "+
				studentLee.studentID);

		Student2 studentSon = new Student2();
		studentSon.setStudentName("손흥민");
		//System.out.println(Student2.serialNum);
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName+" 학번 : "+
				studentSon.studentID);
	}
}
/*
 * 학생 인스턴스를 생성할 때마다 serialNum 변수 값 증가.
 * 새로 생성되는 학생마다 studentID 변수에 serialNum 값 복사.
 * -> 두 학생의 학번이 다르게 저장되었다.
 *
 * static 변수는 같은 클래스에서 생성된 인스턴스들이 같은 값 공유
 * -> 인스턴스 간에 공통으로 사용할 값이 필요한 경우 유용
 */

// 객체를 생성하지 않고도 자바 static 변수는 접근이 가능하다.
// 상수나 글로벌 변수 등이 필요할 때 쓰면 편리하다.package chapter6;
