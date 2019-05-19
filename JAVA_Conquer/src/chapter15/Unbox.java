package chapter15;
// 참조형을 기본형으로 변환하는 것을 언박싱이라고 한다.
public class Unbox {
    public static void main(String[] args) {
        Integer wrapint = new Integer(629);
        int i = wrapint.intValue();
        System.out.println(i);

        Double wrapdouble = new Double("3.14");
        int di = wrapdouble.intValue();
        System.out.println(di);
    }
}
// 실수형을 정수형으로 바꾸려면 위의 방법보다는 캐스트 연산자가 훨씬 간단하고 편리하다.