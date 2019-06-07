package chapter21;

// CPU와 보조 기억 장치의 속도차를 해소하려면, 중간에 버퍼를 두고 왕창 읽어야 한다.
/*
종류        입출력 클래스        버퍼 클래스
이진 입력   FileInputStream      BufferedInputStream
이진 출력   FileOutputStream     BufferedOutputStream
문자 입력   FileReader           BufferedReader
문자 출력   FileWriter           BufferedWriter

버퍼를 지원하는 클래스는 버퍼를 관리하는 능력은 있지만 입출력 기능 자체는 없다.
그래서 입출력 클래스와 짝을 이루어 사용한다.

BufferedInputStream(InputStream in, [int size]) // 아웃풋도 같은 인수(입출력 객체, 버퍼 크기)
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferBinary {
    public static void main(String[] args) throws Exception {
        byte[] data = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9 };
        FileOutputStream fout = new FileOutputStream("test.buf");
        BufferedOutputStream out = new BufferedOutputStream(fout);
        //BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("test.buf"));
        out.write(data);
        out.close();
        System.out.println("Write success");

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.buf"));
        byte[] indata = new byte[15];
        in.read(indata,0,15);
        in.close();
        for (byte b : indata) {
            System.out.print(b);
        }
    }
}
// 출력 스트림 객체를 먼저 생성하고, 이 객체를 버퍼 입출력 객체의 생성자로 전달한다.
// BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("test.buf")); 합칠 수도 있다.
// 스트림을 닫지 않으면 버퍼의 데이터가 완전히 출력되지 않아 데이터 날아갈 수 있다
// flush 메서드로 스트림을 비우던가, close로 스트림을 닫아야 한다.