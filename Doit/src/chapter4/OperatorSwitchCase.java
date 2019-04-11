package chapter4;

public class OperatorSwitchCase {

	public static void main(String[] args) {
		int num1 = 10, num2 = 2, sum;
		char operator = '+';
		switch (operator) {
		case '+':
			sum = num1 + num2;
			System.out.println(sum);
			break;
		case '-':
			sum = num1 - num2;
			System.out.println(sum);
			break;
		case '*':
			sum = num1 * num2;
			System.out.println(sum);
			break;
		case '/':
			sum = num1 / num2;
			System.out.println(sum);
			break;
		default:
			break;
		}

	}

}
