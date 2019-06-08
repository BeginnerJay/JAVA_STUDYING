package chapter25;

public class ValueTest {
    public static void main(String[] args) {
        Direction[] ways = Direction.values();
        for (Direction way:ways) {
            System.out.print(way + ", ");
        }
        System.out.print("중 하나를 선택하십시오.");
    }
}
