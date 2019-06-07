package chapter23;

public class FuncInterface2 {
    public static void main(String[] args) {
        print(5, i -> i+1);
        print(5, i -> i-1);
        print(5, i -> i*2);
    }

    static void print(int i, PlusOne po) {
        System.out.println("result = " + po.plus(i));
    }
}
// 람다식은 값이어서 대입 가능하며, 다른 메서드의 인수로 사용할 수도 있다.
// ㄱ래서 인수열에서 바로 동작을 지정할 수 있다.