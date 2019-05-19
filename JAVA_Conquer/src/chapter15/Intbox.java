package chapter15;

public class Intbox {
    public static void main(String[] args) {
        int i = 1234;
        Integer wrapint = new Integer(i);
        // Integer wrapint = i;
        // Integer wrapint = Interger.valueOf(i);
        // 세 개 다 같은 뜻이다.
        Integer wrapint2 = new Integer("629");

        String str = wrapint.toString();
        String str2 = wrapint2.toString();

        int ii = Integer.parseInt(str2); // 문자열을 다시 기본형으로 바꿀 때 쓴다.

        System.out.println(str);
        System.out.println(str2);
    }
}
// 래커 클래스의 생성자로 기본형의 변수나 리터럴을 전달하면, 이 값을 감싸는 참조형 객체가 힙에 생성된다.
// 값을 감싸기만 할 뿐 연산을 위한 수치형 타입이 아니다.
    // 기본형처럼 값을 증감시킬 수는 없다.
// 래퍼를 사용하면 정수를 문자열로 쉽게 바꿀 수 있다.