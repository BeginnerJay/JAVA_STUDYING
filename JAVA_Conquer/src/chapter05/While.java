package chapter05;

public class While {
	public static void main(String[] args) {

        int filesize = 720;

        int download = 0;

       

        while (download < filesize) {

            download += 120;

            System.out.println(download + "K �ٿ�ε���....");

        }

        System.out.println("�ٿ�ε� �Ϸ�");

   }
}
