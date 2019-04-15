package chapter7;
// 배열은 대량의 데이털르 최소한의 메모리에 저장, 요소에 인접 -> 처리 속도가 빠르다.
public class Alphabet {
    public static void main(String[] args) {
        String pop = "Yesterday all my troubles seemed so far away" +
                "Now it looks as though they're here to stay" +
                "Oh, I believe in yesterday" +
                "Suddenly i'm not half the man I used to be";
        pop = pop.toLowerCase(); // 다 소문자로 만드는 메서드
        int[] alpha = new int[26];

        for (int i = 0; i < pop.length(); i++) {
            char ch = pop.charAt(i);// charAt() 메서드로 조사하여 문자형 변수 ch에 대입
            if (ch >= 'a' && ch <= 'z') {
                alpha[ch - 'a']++; // 알파벳에 대응되는 요소를 찾아 횟수를 1 증가시킨다.
            }
        }

        for (int i =0; i < alpha.length; i++) {
            char ch = (char)(i + 'a'); //i 값을 다시 문자로 바꿔주기 위함
            System.out.println(ch + " : " + alpha[i]);
        }
    }
}
// 다른 기능
// 아무리 랜덤이라 하더라도 방금 들었던 노래가 또 나오는 것은 어색하며, 적어도 몇 번 앞에 들었던 노래는 뺀다.
// 그러기 위해서는 앞서 선곡했던 노래가 무엇이었는지 기억해야 하는데, 이런 용도에 배열이 적합하다.
// 일정한 크기의 정수형 배열에 앞서 선ㅌ개했던 노래의 번호를 저장해 두고
// 다음 노래를 선택할 때 배열에 없는 것 중 하나를 고르면 배열 크기 이전에 들었던 노래가 다시 재생되지 않는다.