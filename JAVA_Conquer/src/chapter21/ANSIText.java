package chapter21;

import java.io.FileOutputStream;

// UTF-8이 아닌 인코딩으로 텍스트 문서 생성
// 다른 OS와 문자열을 교환하기 위해서는 해당 OS가 인식할 수 있는 포맷의 문자열 생성 필요.
/*
byte[] getBytes(String charsetName)
byte[] getBytes(Charset Charset)
인수로 인코딩 방식의 이름이나 Charset 객체를 전달한다.
이렇게 생성된 바이트 배열은 이진 데이터이므로, 문자 스트림이 아닌 이진 스트림으로 기록된다.
 */

public class ANSIText {
    public static void main(String[] args) throws Exception {
        String text = "우리나라 대한민국\n1234abcd\n이것은 ANSI 텍스트입니다.";
        byte[] ansi = text.getBytes("euc-kr");
        FileOutputStream out = new FileOutputStream("ansi.txt");
        out.write(ansi);
        out.close();
        System.out.println("Write success");
    }
}
