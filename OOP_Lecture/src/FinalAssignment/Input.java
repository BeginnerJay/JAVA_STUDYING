package FinalAssignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    static boolean input() {
        boolean ret=true;
        Scanner scanner = new Scanner(System.in);
        String hakbun, name, tel; // size = 10 + 20 + 10
        final int recordSize=40;
        byte[] oneRecord=new byte[40];

        try {
            boolean cont = true;
            FileOutputStream fileOutputStream = new FileOutputStream(User.fn,true);

            while (cont) {
                System.out.print("학번 : ");
                hakbun=scanner.nextLine();
                System.out.print("이름 : ");
                name=scanner.nextLine();
                System.out.print("연락처 : ");
                tel=scanner.nextLine();
                int tmpLen=hakbun.length();
                for (int i=tmpLen; i<10; i++) {
                    hakbun += 0;
                }
                tmpLen=name.length();
                for (int i=tmpLen; i<20; i++) {
                    name += 0;
                }
                tmpLen=tel.length();
                for (int i=tmpLen; i<10; i++) {
                    tel += 0;
                }

                oneRecord=(hakbun+name+tel).getBytes();
                fileOutputStream.write(oneRecord);

                System.out.print("Continue? yes/no");
                String s_cont=scanner.nextLine();
                if (s_cont.compareTo("yes")!=0)
                    cont=false;
            }

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  ret;
    }
}
