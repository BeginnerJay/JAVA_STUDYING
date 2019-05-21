package lecture0507;
public class NegativeException extends Exception {
	NegativeException() {
		super("������ �ȵ˴ϴ�.");
	}
	NegativeException(int num) {
		super("������ �ȵ˴ϴ�.");
	}

	NegativeException(double num) {
		super("�迭������ ������ϴ�.");
	}
}
