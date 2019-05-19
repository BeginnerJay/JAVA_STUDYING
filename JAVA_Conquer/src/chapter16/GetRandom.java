package chapter16;
// a에서 b 사이의 정수 난수를 골라 리턴한다.
public class GetRandom {
	static int getRandom(int a, int b) {
		return (int)(Math.random()*(b-a)) + a;
	}
}
