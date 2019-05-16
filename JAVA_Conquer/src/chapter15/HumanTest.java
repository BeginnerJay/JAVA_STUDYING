package chapter15;

class HumanTest {
	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "김상형");
        System.out.println(kim);
        Human lee = new Human(43, "이승우");
		Human kimcopy = kim;
		Human kim2 = new Human(29, "김상형");
		
		String str = "범인 : " + kim;
        System.out.println(str);
        
        System.out.println("kim == lee : " + (kim == lee ? "같다":"다르다"));
		System.out.println("kim == kimcopy : " + (kim == kimcopy ? "같다":"다르다"));
        System.out.println("kim == kim2 : " + (kim == kim2 ? "같다":"다르다"));
        // kim과 kim2는 나이도 이름도 같지만, 참조하는 실체가 달라 컴파일러는 두 객체가 다르다고 본다.

        System.out.println("kim.equals(lee) : " + (kim.equals(lee) ? "같다":"다르다"));
		System.out.println("kim.equals(kimcopy) : " + (kim.equals(kimcopy) ? "같다":"다르다"));
		System.out.println("kim.equals(kim2) : " + (kim.equals(kim2) ? "같다":"다르다"));
	}
}