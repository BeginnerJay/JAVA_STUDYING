package chapter2;
// 문자형 변수에 숫자를 저장한다면?
public class CharacterEx3 {
    public static void main(String[] args) {
        //psvm & ctrl+space -> public static void main() []
        int a = 65;
        int b = -66; // 알 수 없는 문자라는 뜻.
        // char는 문자를 저장하는 자료형으로, 2바이트다.
        char a2 = 65;
        // char b2 = -66
        // 문자형 변수에 음수를 넣으면 오류가 발생하므로 주석 처리함
        System.out.println((char)a); // sout + tab 누르면 나온다 <-> sysout + ctrl + space
        System.out.println((char)b); // casting
        System.out.println(a2);
    }
}
