package chapter5;

public class While {
	public static void main(String[] args) {

        int filesize = 720;

        int download = 0;

       

        while (download < filesize) {

            download += 120;

            System.out.println(download + "K 다운로드중....");

        }

        System.out.println("다운로드 완료");

   }
}
