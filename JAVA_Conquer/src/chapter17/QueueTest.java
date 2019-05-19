package chapter17;

import java.util.LinkedList;
// Queue는 인터페이스만 선언되어 있고 구현하는 클래스는 없다.
// 대신 큐의 동작을 완벽히 구현하는 다른 자료 구조 중에서 골라서 쓴다.


public class QueueTest {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("호랑이");
		queue.offer("사자");
		queue.offer("꼬끼리");
		
		while(queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
	}
}
