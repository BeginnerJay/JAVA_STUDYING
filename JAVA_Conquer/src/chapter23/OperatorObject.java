package chapter23;
/*
countover와 countunder를 합칠 수 없는 이유는 동작을 인수로 전달할 수 없기 때문이다.
대신 값의 타입에는 제약이 없다는 점을 이용하면 해결 방법이 있다.
인수로 동작을 감싸는 객체를 전달하면 된다.
 */
public class OperatorObject {
    static int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };
    public static void main(String[] args) {
        System.out.println("over = " + count(new AgeOver()));
        System.out.println("under = " + count(new AgeUnder()));
    }

    static int count(AgeFilter op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (op.isAgeOk(arAge[i])) num++;
        }
        return num;
    }
}

interface AgeFilter {
    boolean isAgeOk(int age);
}

class AgeOver implements AgeFilter {
    public boolean isAgeOk(int age) {
        return (age > 30);
    }
}

class AgeUnder implements AgeFilter {
    public boolean isAgeOk(int age) {
        return (age < 30);
    }
}
/*
인터페이스와 클래스의 계층을 구성해 놓고, 추상 메서드로 다형성을 구현한다. 흔하고 유용.
다만 클래스 선언 및 객체 생성이 번잡하므로 익명 클래스 문버블 쓴다.
한 번만 사용할 객체라면, 익명 클래스를 이용해 바로 객체를 만들어 사용한다.
 */