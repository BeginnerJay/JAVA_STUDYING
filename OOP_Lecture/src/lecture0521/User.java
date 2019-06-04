import java.io.*;
public class User {
	static String fn="student.bin";
	static java.util.Scanner in=null;

	public static void main(String[] args) {
		in=new java.util.Scanner(System.in);
		int num;
		
		System.out.println("학생정보 입력 -> 1, 학생정보 목록 확인 -> 2");
		num=in.nextInt();
		if (num==1) {
			while (input()) ;
		}
		else if (num==2) {
			output();
		}
		
		in.close();
	}

	static boolean input() {
		boolean ret=true;
		in=new java.util.Scanner(System.in);
		String hakbun, name, tel; // size = 10 + 20 + 10
		final int recordSize=40;
		byte[] oneRecord=new byte[40];
		
		try {
			boolean cont=true;
			FileOutputStream fp=new FileOutputStream(fn, true);
			while (cont) {
				System.out.print("학번 : ");
				hakbun=in.nextLine();
				System.out.print("이름 : ");
				name=in.nextLine();
				System.out.print("연락처 : ");
				tel=in.nextLine();
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
				fp.write(oneRecord);
				
				System.out.print("Continue? yes/no");
				String s_cont=in.nextLine();
				if (s_cont.compareTo("yes")!=0)
					cont=false;
			}
			
			fp.close();
			
		}
		catch (IOException e) {
			System.out.println("FileOpen Error!!!");
			
		}
		
		
		return ret;
	}
	
	static void output() {
		
		
	}
}
