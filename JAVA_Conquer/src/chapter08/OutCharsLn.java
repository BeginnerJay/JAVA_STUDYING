package chapter08;

public class OutCharsLn {
    // 호출할 때마다 세 개의 인수를 일일히 전달하는 것이 부담스럽다면, 개행 여부에 따라 별도의 메서드!
    static void outChars(String ch, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }

    static void outCharsLn(String ch, int num){
        outChars(ch, num);
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            outChars("♀", 10-i);
            outCharsLn("♂", i);
        }

    }
}
