package chapter5;
// 참조 값 출력하기
public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student( ); // 첫 번째 인스턴스(학생) 생성
		// Student 클래스 자료형으로 student1 변수를 선언하고,
		// new Student();로 Student 클래스를 생성하여(인스턴스 생성) student1에 대입한다는 뜻
		//student1.studentName = "안연수"; // student1 참조 변수로 studentName 멤버 변수에 이름 저장.
		student1.setStudentName("안연수");


		Student student2 = new Student(); // 두 번째 인스턴스 생성
		// Student 클래스 자료형으로 student2 변수 선언.
		// new Student();로 Student 클래스 생성 -> student2에 대입
		//student2.studentName = "안승연";
		student2.setStudentName("안승연");

		System.out.println(student1); // student1의 참조 변수 값 출력
		System.out.println(student2); // student2의 참조 변수 값 출력
		// 클래스 이름@주소 값 형태로 출력. 해시 코드 값이라고도 함
		// student1 변수를 사용하여 student1 인스턴스를 참조할 수 있다.
	}

}
