package chapter8;
// 리턴하는 값이 있다면 리턴값의 타입은 선언부에 명시되어 있다.
// 에러가 발생했거나 작업을 더 계속할 필요가 없을 때에는 중간에 리턴할 수도 있다.
//호출원에서 잘못된 인수를 전달하더라도, 메서드는 방어 코드를 작성하여 오동작을 방지해야 한다.

public class ErrorReturn {
    static int calcSum(int from, int to) {
        if (from > to) {
            return 0;
        }
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("1 ~ 10 = " + calcSum(1,10));
        System.out.println("15 ~ 100 =" + calcSum(15,-100));
    }
}
// 에러 가능성이 있는 상황이면 실행을 즉시 중지하고 호출원으로 에러값을 리턴하여 보고한다.