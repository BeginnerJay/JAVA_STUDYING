package lecture0521;


import java.lang.reflect.*;

public class test02 {

	public static void main(String[] args) {
		Human son=new Human(28, "�����");
		
		Class cls=son.getClass();
		System.out.println("Ŭ���� �̸� : "+cls.getName());
		System.out.println("���� Ŭ���� : "+
		cls.getSuperclass().getName());
		
		System.out.print("�ʵ� : ");
		Field[] fields=cls.getDeclaredFields();
		for (Field F : fields) { 
			System.out.print(F.getName()+" ");
		}
		
		System.out.println();
		System.out.print("�޼��� : ");
		Method methods[]=cls.getDeclaredMethods();
		for (Method M : methods) {
			System.out.print(M.getName()+" ");
		}
		
		System.out.println();		
		
		

	}

}
