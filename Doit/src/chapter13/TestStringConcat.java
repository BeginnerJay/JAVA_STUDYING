package chapter13;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        System.out.println();

        StringConCat concat2 = (s , v) ->   System.out.printf("%s, %s\n", s, v); //System.out.println(s + ", " + v);
        concat2.makeString(s1, s2);
    }
}
// 람다식 역시 익명 내부 클랫 생성 -> 외부 메서드의 지역 변수를 사용하면 변수는 final이 된다.(변경 불가)