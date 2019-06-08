package chapter25;

public class DirectionTest {
    public static void main(String[] args) {
        // Direction origin = new Direction(Direction.EAST) 이렇게 생성할 필요가 없다.
        var origin = Direction.EAST;		// 동쪽으로 초기화
        origin = Direction.SOUTH;				// 남쪽으로 대입
        if (origin == Direction.WEST) { } 		// 서쪽이면
        if (origin != Direction.NORTH) { }		// 북쪽이 아니면
        System.out.println(origin);
        // origin = 9;						// 에러
        // if (origin == Yoil.SUN) { }			// 에러

    }
}
