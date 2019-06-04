package FinalAssignment;

import java.io.RandomAccessFile;

public class test01 {

    public static void main(String[] args) throws Exception{
        RandomAccessFile file=new RandomAccessFile("book.bin", "rw");
        byte[] data=new byte[50];
        int len;
        String imsi="바람의파이터이다정말";
        byte[] imsi_b=imsi.getBytes();

        System.out.println("*******************");
        file.seek(0);
        for ( ; ; ) {
            len=file.read(data);
            if (len != -1) {
                String tmp=new String(data);
                tmp=tmp.substring(0, 23);
                System.out.println(tmp);
            }
            else
                break;
        }

        System.out.println("*******************");
        file.seek(50);
        file.read(data);
        int j=0;
        for (int i=3; i<23; i++, j++) {
            data[i]=imsi_b[j];
        }
        file.seek(50);
        file.write(data);

        file.seek(0);
        for ( ; ; ) {
            len=file.read(data);
            if (len != -1) {
                String tmp=new String(data);
                tmp=tmp.substring(0, 23);
                System.out.println(tmp);
            }
            else
                break;
        }

        file.close();

    }

}
