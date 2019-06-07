package chapter21;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bitmap implements Serializable {
    byte[] raster;
    public Bitmap(int width) {
        raster = new byte[width];
        int i;
        for (i=0;i<100;i++) raster[i] = 1;
        for (i=100;i<width/2;i++) raster[i] = 8;
        for (i=width/2;i<width;i++) raster[i] = 7;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(raster.length);
        int num = 1;
        byte value = raster[0];
        for (int i = 1; i < raster.length; i++) {
            if (value == raster[i]) {
                num++;
            } else {
                out.writeByte(value);
                out.writeInt(num);
                num = 1;
                value = raster[i];
            }
        }
        if (num != 1) {
            out.writeByte(value);
            out.writeInt(num);
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        int length = in.readInt();
        raster = new byte[length];
        int num;
        byte value;
        int offset;
        for (offset = 0;offset < length;) {
            value = in.readByte();
            num = in.readInt();
            for (int i = 0; i < num ; i++) {
                raster[offset] = value;
                offset++;
            }
        }

    }
}
