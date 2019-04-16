package chapter7;
// 아주 복잡한 수학적 계산을 반복적으로 해야 한다면
// 배열에 미리 연산해 두고 결과만 꺼내 쓰는 방식으로 최적화를 수행한다.
// 필요할 때마다 Math.sqrt() 쓰는 것보다 10배 이상 빠르다.
// 배열을 준비하는 데 시간이 걸리더라도 중요한 메인 루프에서 제곱근을 수백번 호출한다면 결과는 달라진다.
public class RootTable {
    public static void main(String[] args) {
        double[] root = new double[10000];

        for (int i = 1; i <= root.length; i++) {
            root[i-1] = Math.sqrt(i);
            System.out.println(i + "의 제곱근 :" + root[i-1]);
        }
        System.out.println("2의 제곱근 :" + root[1]);
    }
}
