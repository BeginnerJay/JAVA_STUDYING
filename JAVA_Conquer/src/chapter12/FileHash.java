package chapter12;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

public class FileHash {
    public String fn;
    public byte[] hash = new byte[32];
    int tot = 0;
    FileInputStream in = null;
    String msg = "";

    public FileHash(String fn) {
        this.fn = fn;
    }

    public void genHash() {

        byte[] in_data = new byte[1000];
        int len = 0;

        try {
            in = new FileInputStream("school.jpg");
            for (; ; ) {
                len = in.read(in_data);
                if (len == -1)
                    break;
                tot += len; //msg=msg+in_data;
            }

            in.close();
        } catch (IOException e) {
            System.out.println("Error!!!!");
        }
    }

    public void displayHash() throws java.lang.Exception {
        try {
            byte[] in_data2 = new byte[tot];
            in = new FileInputStream("school.jpg");
            in.read(in_data2);

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(in_data2);
            hash = md.digest();

            int i = 0;
            for (byte b : hash) {
                i++;
                System.out.printf("%02x", b);
                if (i % 4 == 0)
                    System.out.printf(" ");
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("Error!!!!");
        }
    }
}