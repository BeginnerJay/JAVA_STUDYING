package chapter23;

public class ReadLocal {
    public static void main(String[] args) {
        int value = 123;
        PlusOne po = i -> { System.out.println(value); return i+1; };
        System.out.println("result = " + po.plus(5));
    }
}
// 익명 구현 클래스의 메서드 내에서 this는 자기 자신을 의미하지만,
// 람다식에서의 this는 람다식을 실행한 객체를 의미한다.