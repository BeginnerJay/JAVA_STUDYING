package chapter21;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Charset {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("뜨거운 여름밤은 가고 남은 건 볼품없지만.txt");
        InputStreamReader in = new InputStreamReader(fi, "euc-kr");
        char[] text = new char[1000];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 = " + num);
        System.out.println(text);
        in.close();
    }
}
// 운영체제의 인코딩 설정과 다른 문서를 읽으려면, 더 상위의 InputStreamReader 클래스의 객체를 생성하여 문자 셋 지정.
// 문자 스트림으로 읽는 것이 아니라 이진 스트림으로 읽는다.
// 이 스트림을 InputStreamReader의 생성자로 전달하면서, 인코딩 방식을 인수로 알려 주면
// 내부적으로 인코딩을 변환하여 읽는다.