package chapter27;

import javax.swing.*;
import java.awt.*;

public class Event1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));
        frame.setLocation(500, 500);

        JButton button = new JButton("Click");
        // ② 리스너 객체 생성
        ActionListenerImpl listener = new ActionListenerImpl();
        // ③ 리스너 지정
        button.addActionListener(listener);

        Container cp = frame.getContentPane();
        cp.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
