package chapter27;

import java.awt.*;
// WindowsListener 인터페이스는 윈도우의 상태 변화에 대해 반응하는 핸들러 메서드를 정의한다.
// 윈도우를 닫기 직전에 호출되는 windowsClosing 메서드를 재정의하여
    // 윈도우를 숨기고, 메모리를 정리한 후 응용 프로그램을 종료했다.

// 리스너 구현을 위해 인터페이스의 모든 메서드를 다 구현해야 한다.

public class AWT {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Application");
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.addWindowListener(new WinEventListener());
    }
}
/*
다른 기능은 작동하지만, 닫기 버튼을 눌러도 종료되지 않는다.
기본 동작은 OS가 처리해 주지만, 닫기 동작은 이벤트를 처리해야 한다.
스스로 종료할 수 없어, 작업 관리자에서 강제로 죽여야 된다
 */