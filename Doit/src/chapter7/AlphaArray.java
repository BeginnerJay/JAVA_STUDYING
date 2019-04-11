package chapter7;

public class AlphaArray {
    public static void main(String[] args) {
        char[][] alphabets = new char[13][2];
        char firstChar = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++, firstChar++) {
                alphabets[i][j] = firstChar;
                System.out.printf("%s ", alphabets[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                System.out.printf("%s ", alphabets[i][j]);
            }
            System.out.println(); // 행 출력 끝난 후 한 줄 띄움
        }
        for (int i = 0; i < alphabets[i].length; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                System.out.printf("%s ", alphabets[j][i]);
            }
            System.out.println(); // 행 출력 끝난 후 한 줄 띄움
        }
    }
}