package chapter21;

import java.io.RandomAccessFile;

public class RandomAccessTest2 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("random.dat", "r");

        file.seek(4);
        byte value = file.readByte();
        System.out.print(value);
        file.close();
    }
}
// seek(4)로 FP를 오프셋 4로 이동시키고, readByte로 값 하나를 읽엇다.
// 동영상, 오디오 등은 중간 부분으로 이동해서 읽기도 한다.
// 이럴 때에 랜덤 액세스가 꼭 필요하다(스트림으로는 구현하기 어렵다)