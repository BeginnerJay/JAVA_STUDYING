package chapter21;

import java.io.RandomAccessFile;

public class RandonAccessTest {
    public static void main(String[] args) throws Exception{
        byte[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        RandomAccessFile randomAccessFile = new RandomAccessFile("random.dat", "rw");
        randomAccessFile.write(data);
        System.out.println("Successfully Written");

        randomAccessFile.seek(0);
        for ( ; ; ) {
            int value = randomAccessFile.read();
            if (value == -1)
                break;
            System.out.printf("%d ", value);
        }

        randomAccessFile.close();
    }
}
/* 바이트 값을 기록하므로 임의의 이진 데이터를 기로갈 수 있다
배열의 위치와 길이를 지정하여 일부만 기록할 수도 있다.
데이터를 다 기록하면 FilePointer는 파일의 끝으로 가 있다.
이 상태에서 seek 메서드로 FP를 파일의 선두로 가져온 후 데이터를 읽었다.
rw 모드로 열었으므로, 기록한 후에 FP만 적당한 곳으로 옮기면 다시 읽을 수 있다.
 */