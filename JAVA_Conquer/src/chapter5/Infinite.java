package chapter5;
/*
 * 루프는 제어 변수에 의해 반복 횟수가 미리 정해지는 것이 보통이지만 
 * 조건식을 생략하면 무한 루프가 되어 
 * 별도의 지시가 있을 때까지 계속 반복한다. 
 * 초기식, 증감식은 있어도 상관없지만 
 * 제어 변수가 필요 없어 보통 같이 생략한다.
 */

/*
 * 무한 루프의 정확한 정의는 
 * 반복 횟수가 미리 정해지지 않은 가변적인 루프이다. 
 * 루프 내부에서 탈출할 때는 break 명령을 사용하며 
 * 다음 형태로 무한 루프를 작성한다.
 * 언젠가는 조건이 참이 되어 루프를 탈출해야 한다.
 */
public class Infinite {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int grade;

        for (;;) {
            System.out.print("몇 학년입니까?(1~6) : ");
            grade = scanner.nextInt();
            if (grade >= 1 && grade <= 6) break;
            System.out.println("다시 입력하시오.");
        }
        System.out.println(grade + "학년입니다.");
        scanner.close();      
   }
}
