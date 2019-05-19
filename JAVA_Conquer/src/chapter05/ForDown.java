package chapter05;

public class ForDown {
	public static void main(String[] args) {

        int filesize = 720;

       

        for (int download = 0;download < filesize;) {

            download += 120;

            System.out.println(download + "K �ٿ�ε���....");

        }

        System.out.println("�ٿ�ε� �Ϸ�");

   }
}
