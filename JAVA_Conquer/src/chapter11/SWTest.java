package chapter11;

public class SWTest {

	public static void main(String[] args) {
		SWeight kim = new SWeight("김재욱", 84, 174);
		//kim.check_SWeight(); // 얘를 먼저 안 써주면 제대로 체중 계산이 안된다. 생성자에 메서드를 호출해주자(discouraged)
		kim.display();
	}

}
