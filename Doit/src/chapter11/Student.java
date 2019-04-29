package chapter11;
// 인스턴스의 물리적 동일성(주소)뿐만 아니라 논리적 동일성(내용)을 구현할 때에도 equals()를 재정의하여 사용한다.
public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // overrides equals() method
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if (this.studentID == std.studentID) { // 재정의한 equals() 메서드는 학번이 같으면 true 반환
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID; // 해시 값으로 학번을 반환하도록 메서드 재정의
    }
}
// 비교할 객체가 Object형 매개변수로 전달되면, instanceof를 사용하여 매개변수의 원래 자료형이 Student인지 확인한다.
// this의 학번(메서드 사용시 앞에 . 찍히는 변수)과 매개변수로 전달된 객체의 학번이 같으면 true 반환