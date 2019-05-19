package chapter08;
// 호출되면 모종의 작업을 할 뿐 보고할 사항이 없는 경우 -> void
public class Void {
    static void printSum(int from, int to) {
        if (from > to) {
            System.out.println("ERROR");
        }
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum+=i;
        }
        System.out.printf("%d ~ %d = %d\n", from, to, sum);
    }

    public static void main(String[] args) {
        printSum(1, 10);
        printSum(15, 100);
    }
}
// 만약 에러 처리를 위해 중간에 종료해야 한다면 이 때는 리턴값 없이 단독으로 return;이라고 쓴다.
// void형 메서드는 타입이 없으므로 단독으로만 호출할 수 있으며, 수식 내에서 호출할 수는 없다(피연산자로 사용 불가).
// 리턴값이 있는 메서드는 수식 내에서 호출할 수도 있고, 단독으로 호출할 수도 있다.
