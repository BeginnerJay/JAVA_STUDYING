import java.lang.reflect.*;

public class test02 {

	public static void main(String[] args) {
		Human son=new Human(28, "손흥민");
		
		Class cls=son.getClass();
		System.out.println("클래스 이름 : "+cls.getName());
		System.out.println("슈퍼 클래스 : "+
		cls.getSuperclass().getName());
		
		System.out.print("필드 : ");
		Field[] fields=cls.getDeclaredFields();
		for (Field F : fields) { 
			System.out.print(F.getName()+" ");
		}
		
		System.out.println();
		System.out.print("메서드 : ");
		Method methods[]=cls.getDeclaredMethods();
		for (Method M : methods) {
			System.out.print(M.getName()+" ");
		}
		
		System.out.println();		
		
		

	}

}
