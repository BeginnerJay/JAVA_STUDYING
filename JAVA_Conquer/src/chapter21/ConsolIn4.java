package chapter21;

import chapter03.Int;
import chapter19.StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsolIn4 {
    public static void main(String[] args) {
        System.out.printf("정수를 입력하시오 : ");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String string = bufferedReader.readLine();
            /*
            parseFloat( string )
                수로 시작할 때 그 수를 실수로 바꿉니다.
                띄어 쓰기로 여러 개의 수가 있으면 첫번째 수만 바꿉니다.
                공백으로 시작하면 공백은 무시합니다.
                수가 아닌 문자로 시작하면 NaN을 반환합니다.

             parseInt( string, n )
                string을 n진법일 때의 값으로 바꿉니다.
                n은 옵션으로 2부터 36까지 입력할 수 있습니다.
                입력하지 않으면 10으로 처리합니다.
                string의 처리는 parseFloat()와 거의 같습니다.
                소수 부분은 버립니다.
                0x로 시작하면 16진법으로 처리합니다.
             */
            int i = Integer.parseInt(string);
            System.out.printf("입력값의 2배 = %d", i*2);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Input Error");
        }
    }
}
// 스트림으로부터 입력받은 것은 항상 문자열이어서, 연산에 사용하려면 정수로 변환해야 한다.
// 입력, 계산, 출력 정도를 하는데 코드가 너무 많이 필요해서 더 간단한 방법 도입 -> Scanner