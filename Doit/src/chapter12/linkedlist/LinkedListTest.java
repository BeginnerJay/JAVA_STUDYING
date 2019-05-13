package chapter12.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // LinkedList<String> myList = new LinkedList<String>();
        var myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList); // 리스트 전체 출력

        myList.add(1, "D"); // linkedList의 첫 번째 위치에 D 추가

        myList.addFirst("0"); // 첫 번째 위치에 0 추가

        System.out.println(myList);
        System.out.println(myList.removeLast()); // 연결 리스트의 맨 뒤 요소 삭제 후 해당 요소 출력
        System.out.println(myList);
    }
}
