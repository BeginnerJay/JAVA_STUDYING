package chapter11;

public class HWTest {

	public static void main(String[] args) {
		double weight, height;
		double standardWeight;
		final double BASE = 110, PERCENT = 0.9;
		weight = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("몸무게 입력"));
		height = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("키 입력"));

		standardWeight = (height - BASE)*PERCENT;

		if (weight < standardWeight - 5) {
			System.out.println("저체중");
		} else {
			if (weight > standardWeight + 5) {
				System.out.println("과체중");
			} else {
				System.out.println("정상체중");
			}
		}
	}

}
