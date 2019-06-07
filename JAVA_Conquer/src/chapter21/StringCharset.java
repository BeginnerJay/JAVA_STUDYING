package chapter21;

import java.io.FileInputStream;
// 이진 스트림으로 텍스트 파일의 내용을 그대로 읽은 후, String 클래스의 생성자를 통해 변환한다.
// String은 바이트 배열을, 지정한 인코딩의 문자열로 변환하는 기능을 제공한다.
public class StringCharset {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream(
                "뜨거운 여름밤은 가고 남은 건 볼품없지만.txt");
        byte[] text = new byte[1000];
        int num = in.read(text);
        String utftext = new String(text, "euc-kr");
        System.out.println("읽은 바이트 수 = " + num);
        System.out.println(utftext);
        in.close();
    }
}
// 데이터를 읽어들이는 버퍼가 char 타입이 char 타입이 아니라 byte 타입임에 유의하자(이진 스트림으로 읽기 때문)