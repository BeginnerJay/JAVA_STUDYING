package chapter07;
// 정수형 배열을 선언만 하고 new 연산자로 할당하지 않았다.
// 존재하지 않는 ar[0]에 값을 저장할 수 없으니 error
// 참조형 변수가 null인 경우에는 일반적으로 error를 의미한다.
// 그러나 불가피하게 바꿀 수도, 혹은 의도적으로 null을 대입하기도 한다.
public class Null {
    public static void main(String[] args) {
        int[] ar = null;
        System.out.println(ar[0]);
    }
}
// 참조형 변수에 null을 대입한다는 것은 이 변수를 무효화하여 사용하지 않겠다는 뜻이다.
// 참조 변수가 null이 되면 힙의 정보는 더 이상 읽을 수 없으며 가비지 컬렉터에 의해 회수된다.
// 참조값을 사용할 때에는 참조가 유효한지 점검하는 방어 코드가 필요하다.
/*
if (ar != null) {
    System.out.println(ar[0]);
}
 */