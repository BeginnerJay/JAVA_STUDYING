package chapter18;

public class PrintTest {

	public static void main(String[] args) {
		var p = new Print();
		p.<Integer>print(1234);
		p.<String>print("문자열");
	}

}
