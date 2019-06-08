package chapter27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Click2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));
        frame.setLocation(500, 500);

        JButton button = new JButton("Click");
        /*
        listener 객체도 addActionListener 메서드에서 딱 한 번만 사용된다.
        이런 타입의 객체를 두 개 이상 만들 필요가 없다.
        이럴 때는 굳이 변수를 선언할 필요 없이, 메서드의 인수 목록에서 임시 객체를 생성하여 전달하는 것이 편하다.
         */
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(null, "버튼을 클릭하였습니다.");
            }
        };
        button.addActionListener(listener);

        Container cp = frame.getContentPane();
        cp.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
