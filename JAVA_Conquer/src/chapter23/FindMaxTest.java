package chapter23;

public class FindMaxTest {
    public static void main(String[] args) {
        FindMax add = (a,b) -> a+b;
        System.out.printf("result = %d\n", add.max(3, 7));
        FindMax getsum = (a,b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++)
                sum += i;
            return sum;
        };
        System.out.printf("result = %d", getsum.max(3,7));
    }
}
// 함수형 인터페이스에서 유심시 볼 것은 이름이 아니라 시그니처임을 명심하자.