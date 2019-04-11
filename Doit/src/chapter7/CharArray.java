package chapter7;
// 알파벳 문자와 그에 대응하는 아스키 코드 값 출력하기
// 각 알파벳 문자는 실제 메모리에는 아스키 코드 값으로 저장된다.
public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'a';
        int CH = (int)ch-32;

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch; // 아스키 값으로 각 요소에 저장
        }

        for (int i = 0; i < alphabets.length; i++, CH++) {
            alphabets[i] = (char)(alphabets[i]-32); // 아스키 값으로 각 요소에 저장
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }
}