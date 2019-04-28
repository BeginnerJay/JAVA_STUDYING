package chapter10;
import java.util.ArrayList;
public class Shelf {
    protected ArrayList<String> shelf; // 자료를 순서대로 저장할 ArrayList 선언

    public Shelf() { // 디폴트 생성자
        shelf = new ArrayList<String>(); // Shelf 클래스를 생성하면 ArrayList도 생성된다.
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
