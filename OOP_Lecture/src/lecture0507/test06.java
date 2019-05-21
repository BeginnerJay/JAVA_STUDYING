
public class test06 {

	public static void main(String[] args) {
		method();
	}
	
	static void method() {
		submethod();
	}
	
	static void submethod() {
		int i, a=5, b=0;
		try {
			i=a/b;
			System.out.println(i);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
