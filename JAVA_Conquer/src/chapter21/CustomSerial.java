package chapter21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerial {
    public static void main(String[] args) throws Exception {
        Bitmap girl = new Bitmap(32000);

        // 파일로 출력
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
        out.writeObject(girl);
        out.close();

        // 파일로부터 입력
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl.bitmap"));
        Bitmap girl2 = (Bitmap)in.readObject();
        in.close();
    }
}
