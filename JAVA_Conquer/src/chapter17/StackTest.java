package chapter17;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("호랑이");
		stack.push("사자");
		stack.push("꼬끼리");
		
		while(stack.empty() == false) {
			System.out.println(stack.pop());
		}
	}
}
