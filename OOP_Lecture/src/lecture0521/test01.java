
public class test01 {

	public static void main(String[] args) {
		int i=1234;
		System.out.println(i);
		
		Human kim=new Human(29, "김상형");
		//System.out.println(kim);
		//System.out.println(kim.toString());
		
		Human park=new Human(29, "박지성");
		System.out.println(kim.toString());
		System.out.println(park.toString());
		System.out.println(kim.equals(park));

	}

}
