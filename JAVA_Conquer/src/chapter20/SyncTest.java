package chapter20;

public class SyncTest {
    public static void main(String[] args) {
        chapter20.Memory memory = new chapter20.Memory(256);
        DownLoad downLoad = new DownLoad(memory);
        Play play = new Play(memory);

        downLoad.start();
        play.start();
        // System.out.println("다운로드가 완료되었습니다. 전송르 시작합니다.");
        // 이렇게 하면 순서가 반대로 된다.

        try {
            downLoad.join();
            play.join();
            // main에서 두 스레드가 완전히 끝나기를 기다리고 있다가, 대기가 끝나면 전송을 시작한다.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("다운로드가 완료되었습니다. 전송르 시작합니다.");
    }
}
/*
메모리 클래스가 공유 데이터이며, 다운로드 스레드와 미리 ㅗㅂ기 스레드가 같이 참조한다.
다운로드 받을 동영상을 저장할 buffer 배열을 가지며, buffer 크기와 다운로드 진행 상황을 progress에 기억한다.

주 스레드에서 공유 버퍼 객체를 생성하여 DownLoad와 Play 스레드의 생성자로 전달한다.
각 스레드는 memory라는 이름으로 공유 객체에 대한 참조를 저장 -> 이후의 통신을 준비
한 쪽에서 공유 객체를 변경하면 다른 쪽에서 변경된 내용을 읽을 수 있다.
 */
// 크리티컬 섹션은 한 번 에 한 스레드만 들어갈 수 있다. 나머지 스레드는 대기한다.

// 두 동작을 Memory 클래스 안의 메서드로 캡슐화하고, 스레드에서 공유 객체의 메서드를 호출하는 방법을 쓸 수도 있다.