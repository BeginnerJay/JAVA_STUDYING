package chapter08;

public class OutStar {
    // 출력할 별의 개수를 num 인수로 받아 이만큼 루프를 둘며 별을 찍는다.
    static void outStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    // main 함수는 이중 루프를 돌릴 필요 없이 1에서 10까지 i 루프만 돌리며 outStars(i) 호출하고 개행하면 된다.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            outStars(i);
            System.out.println("");
        }
    }
}
//