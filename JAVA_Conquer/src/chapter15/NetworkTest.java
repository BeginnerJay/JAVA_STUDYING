package chapter15;

public class NetworkTest {
    static void communication() {
        Network network = new Network();
        network.connect();
    }

    public static void main(String[] args) {
        communication();
        System.gc();
        System.runFinalization();
    }
}
// network 객체가 사라질 때 연결을 끊어 줘야 하는데, disconnect를 혹시나 호출하지 않았다면?
// 통신 연결, 권한 획득, DB 오픈 드으이 준비 작업을 했다면, 객체가 사라지기 전에 정리해야 한다.
// 이런 정리 코드를 작성하는 곳이 finalize 메서드이다.

// 비메모리 관련 정리는 동기적으로 수행할 필요가 있어, 언제 호출될지도 모르는 finalize 메서드를 쓰는 경우는 드묾.
// 실제 프로젝트에서는 명시적인 자원 정리 메서드를 만들고, 예외 처리 구문을 통해 적극적으로 정리하는 것이 바람직.