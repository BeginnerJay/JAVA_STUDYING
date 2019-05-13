package chapter13;

class OutClass { // 외부 클래스
    private int num = 10; // 외부 클래스 private 변수
    private static int sNum = 20; // 외부 클래스 static 변수
    // private로 선언했지만, 외부 클래스에 있기 때문에 내부 클래스 안에서도 당연히 사용 가능.

    private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

    public OutClass(/*InClass inClass*/) {
        // this.inClass = inClass;
        inClass = new InClass(); // 외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 내부 클래스 생성 가능
    }

    class InClass { // 인스턴스 내부 클래스
        int inNum = 100; // 내부 클래스의 인스턴스 변수
        // static int sInNum = 200;
        // 인스턴스 내부 클래스에 정적 변수 선언 불가능.
        // 정적 변수는 클래스 생성과 관계없이 쓸 수 있어야 하는데, 인스턴스 내부 클래스는 클래스를 생성해야만 사용 가능

        void inTest() {
            System.out.printf("OutClass num = %d(외부 클래스의 인스턴스 변수\n", num);
            System.out.printf("OutClass sNum = %d(외부 클래스의 정적 변수)\n", sNum);
        }

        // static void sTest() {} // 정적 메서드 역시 정의 불가능.
    }
    public void usingClass() {
        inClass.inTest();
    }

    // 내부 클래스가 외부 클래스 생성과 무관하게 사용할 수 있어야 하고, 정적 변수도 쓸 수 있어야 한다면 정적내부클래스.
    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            // num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.printf("InStaticClass inNum = %d(내부 클래스의 인스턴스 변수 사용)", inNum);
            System.out.printf("InStaticClass sInNum = %d(내부 클래스의 정적 변수 사용)", sInNum);
            System.out.printf("OutClass sNum = %d(외부 클래스의 정적 변수 사용)",sNum);
        }

        static void sTest() {
            // num += 10;
            // inNum += 10; // 외부 및 내부 클래스의 인스턴스 변수는 사용할 수 없다.
            System.out.printf("InStaticClass sInNum = %d(내부 클래스의 정적 변수 사용)", sInNum);
            System.out.printf("OutClass sNum = %d(외부 클래스의 정적 변수 사용)",sNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        // 외부 클래스를 생성하지 않고 내부 클래스 자료형으로 바로 정적 내부 클래스 생성 가능.
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
        System.out.println();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        sInClass.sTest(); // 생성하고 호출
        OutClass.InStaticClass.sTest(); // 바로 호출
    }
}
