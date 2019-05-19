package chapter12;

import java.io.Serializable;

public class Member {
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public void displayInfo() {
		System.out.println("노래 제목 : " + id);
	}
}
