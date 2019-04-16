package chapter8;
// 동일 타입의 인수 여러 개를 전달하는 가변 인수를 지원한다.
public class Varargs {
    static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum +=i;
        }
        return sum;
    }
    // 호출원에서 정수값을 몇 개든 전달할 수 있다.
    // 실인수 전체를 배열로 묶어 형식 인수로 전달하여, 이 배열의 length 속성으로 개수를 조사하고
    // 배열을 순회하며 인수 목록을 읽는다.
    public static void main(String[] args) {
        System.out.println(getSum(1,2));
        System.out.println(getSum(3,2,5,7));
        System.out.println(getSum(1,9,9,4,0,4,0,2));
    }
}
// 가변 인수 목록은 사실상 배열을 전달하는 것과 같아, 진짜 배열을 만들어 전달해도 잘 동작한다.
// 별도의 배열을 선언하는 것이 귀찮다면 인수열에서 new 연산자로 임시 배열을 바로 생성하여 전달해도 상관없다.
// 형식 인수를 배열 타입으로 선언할 수도 있다.
// 선언문에 ...이라고만 밝혀 놓으면 컴파일러가 실인수 전체를 배열로 만들어 전달하는 일종의 편의 기능이다.