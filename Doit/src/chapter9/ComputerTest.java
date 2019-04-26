package chapter9;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); // 오류 발생(인스턴스로 생성 불가)
        Computer c2 = new DeskTop();
        //Computer c3 = new Notebook();// 오류 발생(인스턴스로 생성 불가)
        Computer c4 = new MyNoteBook();
    }
}
// 추상 클래스는 인스턴스로 생성할 수 없다(모든 메서드가 아직 다 구현되지 않았으므로 수행할 수 있는 것이 없다.)
// 추상 클래스는 상속을 하기 위해 만든 클래스이다.