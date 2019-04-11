package chapter5;
// StudentTest 실행 클래스 만들기
public class StudentTest {

	public static void main(String[] args) {
		// 만약 패키지가 다르다면 import 문을 사용해서 함께 사용하기를 원하는 클래스를 불러와야 한다.
		Student studentAhn = new Student( ); // new로 Student 클래스 생성
		// studentAhn.studentName = "안승연"; // 클래스의 멤버 변수에 값을 대입하는 코드. 변수가 private인 경우에는 오류 발생
		// studentName 변수의 access modifier가 private 이므로 not visible해서 오류가 발생한다.
		studentAhn.setStudentName("이상원"); // setter를 이용하여 private 변수에 접근 가능!


		// System.out.println(studentAhn.studentName); // 학생 이름 직접 찾음(변수가 private인 경우에는 오류 발생)
		System.out.println(studentAhn.getStudentName( )); // 메서드로 학생 이름 확인

	}

}
