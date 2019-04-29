package chapter11;
// String 클래스를 사용하여 문자열을 계속 연결하거나 변경하면 메모리 낭비 多
    // StringBuffer와 StringBuilder 클래스를 사용한다.
// 이 두 클래스를 사용하여 문자열을 연결하면 기존에 사용하던 char[] 배열이 확장 -> 추가 메모리 사용 無
// 두 클래스의 차이
    // StringBuilder : 멀티 스레드 보장하지 않음, 속도 더 빠름
    // StringBuffer : 멀티 스레드 보장함, 속도는 조금 느림
public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.printf("javaStr 문자열 주소 : %d\n", System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr); // String으로부터 StringBuilder 생성
        System.out.printf("연산 전 buffer 메모리 주소 : %d\n", System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!!"); // 문자열 추가
        System.out.printf("연산 후 buffer 메모리 주소 : %d\n", System.identityHashCode(buffer));

        javaStr = buffer.toString(); // buffer를 String클래스로 변환하여 javaStr에 대입
        System.out.println(javaStr);
        System.out.printf("연결된 javaStr 문자열 주소 : %d\n", System.identityHashCode(javaStr));

    }
}
