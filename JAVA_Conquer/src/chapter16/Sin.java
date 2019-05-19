package chapter16;

public class Sin {
	public static void main(String[] args) {
		for (double d = 0 ; d <= 90; d += 15) {
			System.out.println("sin(" + d + ") = " + 
					Math.sin(Math.toRadians(d)));
		}
	}
}
