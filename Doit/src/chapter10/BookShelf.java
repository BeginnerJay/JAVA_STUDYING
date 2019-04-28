package chapter10;
// Shelf 클래스가 갖고 있는 ArrayList 배열을 사용하여 Queue 인터페이스에서 선언한 메서드를 모두 구현한다.
public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) {
        shelf.add(title); // 배열에 요소 추가
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); // 맨 처음 요소를 배열에서 삭제하고 반환
    }

    @Override
    public int getSize() {
        return getCount(); // 배열 요소 개수 반환
    }
}
