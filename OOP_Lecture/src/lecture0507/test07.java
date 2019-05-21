
public class test07 {

	public static void main(String[] args) {
		int a=5, b=0, c;
		int[] arr= {1,2,3,4,5};
		
		if (b==0) {
			NegativeException e1=new NegativeException(1);
			System.out.println(e1.getMessage());
		}
		else {
			c=a/b;
			System.out.println("c="+c);
		}
		int i=5;
		if (i<0 || i>=5) {
			NegativeException e2=new NegativeException(2.0);
			System.out.println(e2.getMessage());
		}
		else {
			System.out.println(arr[i]);
		}
	}

}
