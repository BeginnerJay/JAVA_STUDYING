package chapter9;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player(); // 처음 생성하면 BeginnerLevel
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
// Player 클래스부터 만들 수도 있지만, 반대로 MainBoard부터 만들고 그것이 제대로 실행되도록 구현하는 방법도 있다.
// 이렇게 테스트 코드를 먼저 개발하는 개발 방법론을 Test Driven Development라고 한다.
    // 테스트 코드를 만들 수 있다는 것은, 이미 구현 코드가 머릿속에 있다는 뜻이기도 하다.