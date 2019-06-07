package chapter21;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        System.out.println("복사 시작");
        FileInputStream src = new FileInputStream("src.dat");
        FileOutputStream dest = new FileOutputStream("dest.dat");
        int data;
        for(;;) {
            data = src.read();
            if (data == -1) break;
            dest.write(data);
        }
        src.close();
        dest.close();
        System.out.println("복사 완료");
        System.out.println((System.currentTimeMillis()-start)/1000.0 + " 초 걸림");
    }
}
// 1바이트 씩 읽어 dest에 읽기를 반복한다. 루프를 엄청나게 많이 돌기 때문에 느리다.