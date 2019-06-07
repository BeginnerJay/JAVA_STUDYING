package chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIO {
    public static void main(String[] args) throws Exception{
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test2.dat"));
        dataOutputStream.writeInt(13123313);
        dataOutputStream.writeDouble(3.14159265);
        String string = ReadString.ReadFileToString("주저하는 연인들을 위해_UTF8.txt");
        dataOutputStream.writeUTF(string);
        dataOutputStream.close();
        System.out.println("Successfully Written");

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test2.dat"));
        int i = dataInputStream.readInt();
        double d = dataInputStream.readDouble();
        String str = dataInputStream.readUTF();

        System.out.printf("i = %d, d = %f,\nstr = %s", i, d, str);
    }
}
