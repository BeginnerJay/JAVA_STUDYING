package chapter3;
public class OperationEx2 {
	// 증가, 감소 연산자를 이용하여 값 연산하기
	public static void main(String[] args) {
		int gameScore = 150;

		int lastScore1 = ++gameScore; // gameScore에 1만큼 더한 값을 lastScoore1에 대입
		System.out.println(lastScore1); // 151

		int lastScore2 = --gameScore; // gameScore에소 1만큼 뺀 값을 lastscoree2에 대입
		System.out.println(lastScore2); // 150
	}
}
