package lecture0507;
public class test03 {

	public static void main(String[] args) {
		Unit[] arUnit= { new Marine(), new Zealot(), new Mutal()};

		for (Unit u : arUnit) {
			u.move();
			u.attack();
		}
	}

}
