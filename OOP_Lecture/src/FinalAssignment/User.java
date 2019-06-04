package FinalAssignment;

public class User {
    static String fn = "student.boin";
    static java.util.Scanner scanner = null;

    public static void main(String[] args) {
        scanner = new java.util.Scanner(System.in);
        int num;


        System.out.println("학생정보 입력 -> 1, 학생정보 목록 확인 -> 2");
        num=scanner.nextInt();
        if (num==1) {
            while (Input.input()) ;
        }
        else if (num==2) {
            Output.output();
        }

        scanner.close();
    }
}
