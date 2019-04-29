package chapter11;

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); // abc 문자열의 해시코드 값 출력
        // 같은 문자열을 갖고 있으면 동일한 해시 값 반환하도록 재정의됨.

        Integer i1 = Integer.valueOf(100); // replace with Integer.valueof()
        Integer i2 = new Integer(100);
        Integer i3 = 100; // remove boxing

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i3.hashCode());
        // 동일한 정수 값 반환하도록 재정의됨.
    }
}
