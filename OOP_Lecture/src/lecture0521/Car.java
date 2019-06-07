package lecture0521;

public class Car {
	String name;
	boolean gasoline;
	
	void run() {
		if (gasoline) {
			System.out.println("�θ� �θ�");
		}
		else {
			System.out.println("���� ����");
		}
	}
	
	void stop() {
		System.out.println("������");
	}

}
