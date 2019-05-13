package chapter13;

class Outer2 {
    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() { // 익명 내부 클래스. Runnable 인터페이스 생성

            @Override
            public void run() {
                // num = 200;
                // i = 10;
                System.out.println(i);
                System.out.println(num);
            }
        }; // 클래스 끝에 ;를 써 줘야 익명 내부 클래스가 성립한다.
    }
    Runnable runner = new Runnable() { // 익명 내부 클래스를 변수에 대입
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    }; // 클래스 끝에 ;를 써 줘야 성립함.
    // 인터페이스나 추상 클래스형 변술ㄹ 선언하고, 클래스를 생성해 대입하는 방법
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runnable = out.getRunnable(10);
        runnable.run();
        out.runner.run();
    }
}
// 익명 내부 클래스는 단 하나의 인터페이스 혹은 단 하나의 추상 클래스를 바로 생성할 수 있다.