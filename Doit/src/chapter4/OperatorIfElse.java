package chapter4;

public class OperatorIfElse {

	public static void main(String[] args) {
		int num1 = 10, num2 = 2, sum;
		char operator = '+';
		if (operator == '+') 
		{
			sum = num1 + num2;
			System.out.println(sum);
		} 
		else if (operator == '-') 
		{
			sum = num1 - num2;
			System.out.println(sum);
		}
		else if (operator == '*') 
		{
			sum = num1 * num2;
			System.out.println(sum);
		}
		else if (operator == '/') 
		{
			sum = num1 / num2;
			System.out.println(sum);
		}
	}
}
