package chapter15;
// System의 모든 멤버는 정적으로 선언되어 있어, 객체를 따로 만들 필요 없이 System.멤버 식으로 사용한다.
public class Printf {
    public static void main(String[] args) {
        int i = 123;
        double d = 3.14;
        String str = "문자열";
        System.out.printf("i = %d, d = %f, str = %s\n", i, d, str);
    }
}
