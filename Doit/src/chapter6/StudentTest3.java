package chapter6;
/*
static 변수는 인스턴스를 생성할 때마다 만들어지는 것이 아니고,
클래스를 선언할 때 특정 메모리에 저장되어(데이터 영역) 모든 인스턴스가 공유하는 변수이다.
static 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼저 생성된다.
그러므로 인스턴스가 아닌 클래스 이름으로도 참조하여 사용할 수 있다.
 */
public class StudentTest3 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이지은");
        System.out.println(Student1.serialNum);
        System.out.println(studentLee.studentName + "학번" + studentLee.studentID);

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손흥민");
        System.out.println(Student1.serialNum);
        System.out.println(studentSon.studentName + "학번" + studentSon.studentID);
    }
}
