package chapter12.arrayList;
import java.util.ArrayList;
public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {
        arrayStack.add(data); // 스택의 맨 뒤에 요소를 추가
    }

    // 가장 위에 있는 자료를 꺼내는 pop() 구현
    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        } else {
            return arrayStack.remove(len-1);
        }
    }
}
