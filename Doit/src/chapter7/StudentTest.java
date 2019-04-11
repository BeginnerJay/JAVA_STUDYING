package chapter7;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        studentLee.showStudentInfo();
    }
}
