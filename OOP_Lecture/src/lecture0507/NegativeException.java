
public class NegativeException extends Exception {
	NegativeException() {
		super("음수는 안됩니다.");
	}
	NegativeException(int num) {
		super("음수는 안됩니다.");
	}

	NegativeException(double num) {
		super("배열범위를 벗어났습니다.");
	}
}
