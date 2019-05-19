package chapter07;

public class Lookup3 {
    public static void main(String[] args) {
        int score = 2;
        String[] message = {
                "",
                "최고의 성적입니다. 축하합니다.",
                "우수한 성적입니다.",
                "보통입니다.",
                "다소 부진합니다. 더 노력하세요",
                "와사노",
        };
        int[] rank = {5,4,4,3,3,3,2,2,1,1};
        // 점수 5로부터 rank 배열에서 3등급입을 알아내고, message 배열에서 3등급의 메시지를 꺼내 출력했다.
        System.out.println(message[rank[score]]);
    }
}
