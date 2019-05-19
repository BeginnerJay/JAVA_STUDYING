package chapter17;

import java.util.*;

public class Shuffle {
	public static void main(String[] args) {
		ArrayList<String> arName = new ArrayList<String>(); 
		arName.add("장보고");
		arName.add("김유신"); 
		arName.add("강감찬"); 
		arName.add("을지문덕"); 
		
		Collections.shuffle(arName);
		// 요소의 순서가 무작위로 바뀐다.
		
		for(String name : arName) {
			System.out.print(name + " ");
		}
	}
}
