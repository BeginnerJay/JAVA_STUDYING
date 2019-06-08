package chapter27;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ① 리스너 클래스 정의
public class ActionListenerImpl implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "버튼을 클릭하였습니다.");
    }
}
// 인터페이스를 구현하기 위해 선언한 것일 뿐, 다른 용도는 없다 -> 익명 클래스로 선언하자.