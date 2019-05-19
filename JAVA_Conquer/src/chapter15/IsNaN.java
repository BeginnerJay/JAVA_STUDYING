package chapter15;

public class IsNaN {
    public static void main(String[] args) {
        double d = Math.sqrt(-2);
        if (Double.isNaN(d)) {
            System.out.println("숫자가 아님");
        } else {
            System.out.println("숫자가 맞음");
        }
    }
}
// NaN 여부를 조사할 때 if(d == Double.NaN)처럼 직접 비교하면 안 된다.
// NaN은 수가 아니라 일종의 상태여서, NaN과 수치값을 비교하면 결과는 무조건 False이다.