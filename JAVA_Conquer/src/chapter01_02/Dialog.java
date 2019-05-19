package chapter01_02;

public class Dialog {

	public static void main(String[] args) {
		// 스캐너를 쓰는 방법이 어렵다면 그래픽 라이브러리인 스윙의 대화상자 사용도 가능
		String 이름 = javax.swing.JOptionPane.showInputDialog("이름을 입력하시오");
		System.out.println("안녕하세요 " +이름+ "님.");

		String 나이창 = javax.swing.JOptionPane.showInputDialog("나이를 입력하시오");
		int 나이 = Integer.parseInt(나이창);
		System.out.println("당신은 " +나이+ "살입니다.");
	}

}
