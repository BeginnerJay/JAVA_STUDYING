package chapter11;
// 자바는 String 클래스를 제공해 char[] 배열을 직접 구현하지 않고도 편리하게 문자열 사용 가능.
// String 클래스의 구현 내용을 보면 private final char value[]라고 선언된 char 배열이 있다.
// String을 쓰면 문자열은 String 클래스의 value 변수에 저장. 그런데 이 배열은 final -> 수정 불가능.
// 그럼 두 문자열을 연결하면?
    // 둘 중 하나의 문자열이 변경되는 것이 아니라, 두 문자열이 연결된 새로운 문자열이 생성된다.
public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String andStr = new String("android");
        System.out.println(javaStr);
        System.out.printf("처음 문자열 주소 값 : %d\n", System.identityHashCode(javaStr));

        // 문자열 javaStr와 문자열 andStr를 연결하여 javastr에 대입
        javaStr = javaStr.concat(andStr);

        System.out.println(javaStr);
        System.out.printf("연결된 문자열 주소 값 : %d\n", System.identityHashCode(javaStr));
        // "javaandroid"문자열이 새로 생성되고, javaStr은 그 문자열을 가리키게 된다.
    }
}
