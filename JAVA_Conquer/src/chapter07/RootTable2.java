package chapter07;
// 미리 다 계산해 놓지 않고, 요청이 들어올 때 계산한 결과를 저장해 두고
// 다음 요청 시에는 저장한 값을 사용하는 방법도 있다. 이를 캐시 기법이라 한다.
// 이런 기법을 사용하려면 정적 배열과 정적 메서드가 필요하다.
public class RootTable2 {
                                          static double[] root = new double[100];

    static double getRoot(int i) {
        if (root[i] == 0) {
            root[i] = Math.sqrt(i);
        }
        return root[i];
    }

    public static void main(String[] args) {
        System.out.println("2의 제곱근 : " + getRoot(2));
        System.out.println("5의 제곱근 : " + getRoot(5));
        System.out.println("2의 제곱근 : " + getRoot(2));
    }
}
// root 배열을 지역 변수가 아닌 정적 배열로 선언하여 값을 계속 유지하도록 하고
// getRoot 메서드는 이 배열에 계산 결과를 저장한다.

// 메모리를 더 쓰면 속도는 올라간다.