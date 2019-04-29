package chapter11;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 인스턴스가 매번 새로 생성 -> 주소값은 다름
        System.out.println(str1.equals(str2)); // 문자열 값은 같음 -> true 반환

        // 생성자를 이용하지 않고 바로 문자열 상수를 가리키는 경우에는 상수 풀에 저장된다.
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); // 문자열 abc가 상수 풀에 저장 -> 가리키는 주소 값이 서로 같다.
        System.out.println(str3.equals(str4)); // 문자열 값도 또한 같다.
    }
}
