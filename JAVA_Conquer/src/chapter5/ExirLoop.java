package chapter5;

public class ExirLoop {
	public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1;j <= 9;j++) {
                 if (i == 2 && j == 3) break;
                 System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}
// 3단부터는 정상적으로 출력된다.