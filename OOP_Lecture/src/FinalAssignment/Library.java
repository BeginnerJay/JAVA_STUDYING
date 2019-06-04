package FinalAssignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Library {
    String book_fn;

    public Library(String book_fn) {
        this.book_fn = book_fn;
    }

    /* book_fn 파일의 레코드 형식
     * book_no : 3 byte
     * book_title : 20 byte
     * book_loan : 1 byte
     * loaner : 6 byte
     * book_res : 1 byte
     * book_can : 6 byte
     * etc : 17 byte
     */

    public void input_data_book_file() {
        final int recordSize=50;
        final int book_title_size=20;
        final byte paddingChar='A';
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream(book_fn, true);
            String tmp;
            boolean cont = true;
            while (cont) {
                byte[] oneLine=new byte[recordSize];
                tmp=javax.swing.JOptionPane.showInputDialog("책번호");

                int j=0;
                for (int i=0; i<3; i++, j++) {
                    oneLine[j]=(byte)(tmp.charAt(i));
                }

                tmp=javax.swing.JOptionPane.showInputDialog("책제목");
                byte[] tmp_b=tmp.getBytes();

                for (int i=0; i<tmp_b.length; i++, j++) {
                    oneLine[j]=tmp_b[i];
                }
                for (int i=tmp_b.length; i<book_title_size; i++, j++) {
                    oneLine[j]=paddingChar;
                }

                oneLine[j++]=0;
                for (int i=24; i<30; i++, j++) {
                    oneLine[j]=paddingChar;
                }
                oneLine[j++]=0;

                for (int i=31; i<50; i++, j++) {
                    oneLine[j]=paddingChar;
                }
                fileOutputStream.write(oneLine);

                tmp=javax.swing.JOptionPane.showInputDialog("계속하시겠습니까? (yes/no)");
                if (tmp.compareTo("yes")==0) {
                    ;
                }
                else {
                    cont = false;
                }
            }

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
