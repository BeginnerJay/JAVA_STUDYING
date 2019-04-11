package chapter7;
import java.util.ArrayList;

class Student {
    private static int serialNum = 1000;
    private int studentID;
    String name;
    String subjectName;
    ArrayList<Subject> subjectList; // ArrayList 선언하기(아직 할당은 안함)

    Student() {
        serialNum++;
        studentID = serialNum;
    }

    Student(String name) {
        serialNum++;
        studentID = serialNum;
        this.name = name;
        subjectList = new ArrayList<Subject>(); // ArrayList 생성(할당)(인스턴스화)
    }

    void setName(String name) {
        this.name = name;
    }

    void addSubject(String name, int score) {
        Subject subject = new Subject(); // Subject 생성하기(subjectList에 들어갈 element)
        subject.setName(name); // 과목 이름 추가하기
        subject.setScorePoint(score); // 점수 추가하기
        subjectList.add(subject);
    }

    void showStudentInfo() {
        System.out.println(studentID + "," + name);
        int total = 0;
        for (int i = 0; i < subjectList.size(); i++) {
            total += subjectList.get(i).getScorePoint();

            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다.\n",
                    name, subjectList.get(i).getName(), subjectList.get(i).getScorePoint());
        }

        System.out.printf("학생 %s의 총점은 %d입니다.", name, total);
    }
}
