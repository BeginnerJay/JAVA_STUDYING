package chapter15;

import java.lang.reflect.*;

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

		Class cls = kim.getClass();
		System.out.println("클래스 이름 = " + cls.getName());
		System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());

		System.out.print("필드 : ");
		Field[] fields = cls.getDeclaredFields(); // Class 객체 메서드 쓰려면 java.lang.reflect.* 필요
		for (Field F : fields) {
			System.out.print(F.getName() + " ");
		}

		System.out.println();
		System.out.print("메서드 : ");
		Method methods[] = cls.getDeclaredMethods();
		for (Method M : methods) {
			System.out.print(M.getName() + " ");
		}
		System.out.println();
		
		Human kim3 = (Human)kim.clone();

		kim3.name = "이순신";
		
		System.out.println("kim.name : " + kim.name);
		System.out.println("kim2.name : " + kim3.name);

        kim3.score[0] = 999;

        System.out.println("kim.score[0] : " + kim.score[0]);
        System.out.println("kim3.score[0] : " + kim3.score[0]);
	}
}