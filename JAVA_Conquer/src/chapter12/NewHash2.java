package chapter12;
import java.security.MessageDigest;
import java.io.*;

public class NewHash2 {

    public static void main(String[] args) throws Exception {
        //FileInputStream in=new FileInputStream("school.jpg");
        FileInputStream in=null;
        String msg="";
        byte[] hash=new byte[32];
        byte[] in_data=new byte[1000];
        int len=0, tot=0;
        System.out.println("1.****************************");
        FileOutputStream test=new FileOutputStream("ss.bin");
        byte[] t={'o','o','o'};
        test.write(t);
        test.close();
        System.out.println("2.****************************");

        try {
            System.out.println("****************************");
            in=new FileInputStream("school.jpg");

            for ( ; ; ) {
                len=in.read(in_data);
                if (len==-1)
                    break;
                tot += len; //msg=msg+in_data;
            }
System.out.println("****************************");
            in.close();
            byte[] in_data2=new byte[tot];
            in=new FileInputStream("bbb.jpg");
            in.read(in_data2);

            MessageDigest md=MessageDigest.getInstance("SHA-256");
            md.update(in_data2);
            hash=md.digest();

            int i=0;
            for (byte b : hash) {
                i++;
                System.out.printf("%02x",  b);
                if (i%4 == 0)
                    System.out.printf(" ");
            }

            in.close();
        }
        catch (IOException e) {
            System.out.println("Error!!!!");
        }

    }

}
