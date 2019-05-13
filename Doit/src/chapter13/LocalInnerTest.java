package chapter13;
// 지역 내부 클래스는, 지역 변수처럼 메서드 내부에서 클래스를 정의하여 사용하는 것을 말한다.
// 지역 내부 클래스는 메서드 안에서만 사용 가능하다.
class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;


        class MyRunnable implements Runnable { // 지역 내부 클래스
            int localNum = 100; // 지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() {
                // num = 200; // 지역 변수는 상수로 바뀌므로, 값을 변경할 수 없어 오류 발생
                // i = 100; 매개변수도 지역변수처럼 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
                System.out.printf("i = %d\n", i);
                System.out.printf("num = %d\n", num);
                System.out.printf("localNum = %d\n", localNum);
                System.out.printf("outNum = %d(외부 클래스 인스턴스 변수)\n", outNum);
                System.out.printf("Outer.sNum = %d(외부 클래스 정적 변수)\n", Outer.sNum);
            }
        }
        return new MyRunnable();
        // 지역 내부 클래스 MyRunnable을 선언했지만, 이 클래스 이름을 사용하는 곳은 맨 마지막에 클래스를 반환할때뿐.
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(13123313); // 메서드 호출(getRunnable() 메서드의 호출이 끝남)
        runner.run(); // run()이 실행되면서, getRunnable() 메서드의 지역 변수가 사용됨.
    }
}
