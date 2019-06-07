package chapter21;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        System.out.println("입력값의 2배 = " + i*2);
    }
}
/*
Scanner 클래스는 파일이나 문자열로부터 정보를 추출하는 기능 제공.
생성자로 in 객체를 전달하면 키보드로부터 입력된 정보를 읽어낸다.
요청된 타입의 값을 읽어 줌 -> 별도의 변환이 필요 없다.
예외 처리도 강제적이지 않음 -> 코드가 간단하고 직관적이다.
 */