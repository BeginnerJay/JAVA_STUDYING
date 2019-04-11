package chapter7;

public class StudentArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        students[0].setName("James");
        students[1].setName("Thomas");
        students[2].setName("Edward");
        for (int i = 0; i < students.length; i++) {
            students[i].showStudentInfo();
        }


    }
}
