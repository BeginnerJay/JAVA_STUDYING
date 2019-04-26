package chapter9;
// 모든 추상 메서드가 구현된 클래스 -> abstract 예약어 사용하지 않음.
public class MyNoteBook extends Notebook {
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing()");
    }
}
// 모둔 추상 메서들르 구현한 클래스에도 abstract 예약어를 사용할 수 있다.(공통 기능만을 모두 구현한 추상 클래스)