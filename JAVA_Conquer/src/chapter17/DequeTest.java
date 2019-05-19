package chapter17;

import java.util.ArrayDeque;
import java.util.Deque;
// Deque 인터페이스를 구현한 ArrayDeque 클래스가 Stack을 대체한다.

// 더 개선된 기능을 쓰고 싶다면 양방향 삽입/삭제가 가능한 Deque가 좋다.
public class DequeTest {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		stack.push("호랑이");
		stack.push("사자");
		stack.push("꼬끼리");
		stack.addLast("기린");
		
		while(stack.isEmpty() == false) {
			System.out.println(stack.pop());
		}
	}
}
