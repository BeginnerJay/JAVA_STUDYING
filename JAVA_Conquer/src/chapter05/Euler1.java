package chapter05;

public class Euler1 {

	public static void main(String[] args) {
		double pie = 0;
		for (int i = 1; i < 1000; i++) {
			pie = pie + ( 1.0/(i * i) );
		}
		pie = Math.sqrt(pie*6);
		System.out.println("pie = "+pie);
	
		for (int end = 1; end < 100000000 ; end*=10) {
			double result = 0;
			for (int i = 1; i < end; i++) {
				
				result = result + ( 1.0/((long)i * i) );
			}
			result = Math.sqrt(result*6);
			System.out.println("pie = " + result + "("+end+"ȸ)");
		}
	}

}
