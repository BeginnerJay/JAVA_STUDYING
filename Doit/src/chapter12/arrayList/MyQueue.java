package chapter12.arrayList;
import java.util.ArrayList;
public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data); // 큐의 맨 뒤에 추가
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        } else {
            return arrayQueue.remove(0); // 맨 앞 자료 반환하고 배열에서 제거
        }
    }
}
