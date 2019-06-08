package chapter27;

import javax.swing.*;
import java.awt.*;

public class NestedLayoutSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setLocation(500, 500);

        // 전체 레이아웃은 수직 박스
        Container cp = frame.getContentPane();
        BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
        cp.setLayout(layout);

        // 위에 레이블 배치
        JLabel label = new JLabel("label");
        cp.add(label);

        // 패널에 플로우 레이아웃 설정
        JPanel panel = new JPanel();
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);

        // 두 개의 버튼 추가
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        panel.add(btn1);
        panel.add(btn2);

        // 패널을 전체 레이아웃에 추가
        cp.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
