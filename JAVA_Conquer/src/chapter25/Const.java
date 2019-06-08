package chapter25;

public class Const {
	void main(String[] args) {
		final int EAST = 1;
		final int WEST = 2;
		final int SOUTH = 3;
		final int NORTH = 4;
		
		int origin = EAST;				// 동쪽으로 초기화
		origin = SOUTH;				// 남쪽으로 대입
		if (origin == WEST) { } 		// 서쪽이면
		if (origin != NORTH) { }			// 북쪽이 아니면
	
	}
}
