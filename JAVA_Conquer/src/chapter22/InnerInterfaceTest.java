package chapter22;
/*
인터페이스도 중첩 선언 가능하다.
    클래스 안의 인터페이스
    인터페이스 안의 인터페이스
    인터페이스 안의 클래스
    모두 가능하다.
세 경우 모두 static만 가능하며, static 지정자를 붙이지 않아도 자동으로 붙은 것으로 간주.
사용 빈도는 매우 낮다.
 */

public class InnerInterfaceTest {
    public static void main(String[] args) {
        Staff kim = new Staff();
        Staff.Workable kimwork = new Staff.Workable() {
            public void work(String what, int time) {
                System.out.println(what + " 작업을 " + time + "시간동안 열심히 하기");
            }
        };
        kim.doWork(kimwork, "보고서 작성", 2);

        Staff lee = new Staff();
        Staff.Workable leework = new Staff.Workable() {
            public void work(String what, int time) {
                System.out.println(time + "시간동안  빈둥대며 " + what);
            }
        };
        kim.doWork(leework, "커피 타기", 3);
    }
}
