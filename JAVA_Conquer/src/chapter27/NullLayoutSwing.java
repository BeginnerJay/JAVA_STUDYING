package chapter27;

import javax.swing.*;
import java.awt.*;

public class NullLayoutSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setLocation(500, 500);

        JButton btn1 = new JButton("one");
        JButton btn2 = new JButton("two");

        frame.setLayout(null);

        frame.add(btn1);
        frame.add(btn2);

        btn1.setLocation(10, 10);
        btn1.setSize(100, 50);
        btn2.setLocation(200, 100);
        btn2.setSize(150, 80);

        frame.pack();
        frame.setVisible(true);
    }
}
