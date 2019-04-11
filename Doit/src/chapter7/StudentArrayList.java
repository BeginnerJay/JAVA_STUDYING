package chapter7;
import java.util.ArrayList;
public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        int arrayWish = 3;
        for (int i = 0; i < arrayWish; i++) {
            students.add(new Student());
        }

        students.get(0).setName("James");
        students.get(1).setName("Thomas");
        students.get(2).setName("Edward");

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.showStudentInfo();
        }

        for (Student student : students) {
            student.showStudentInfo();
        }

    }

}
