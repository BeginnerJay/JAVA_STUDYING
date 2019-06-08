package chapter27;

import javax.swing.*;
import java.awt.*;

public class GridLayoutSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setLocation(500, 500);

        JButton btn1 = new JButton("one");
        JButton btn2 = new JButton("two");
        JButton btn3 = new JButton("three");
        JButton btn4 = new JButton("four");
        JButton btn5 = new JButton("five");

        Container cp = frame.getContentPane();
        GridLayout layout = new GridLayout(3,2);
        cp.setLayout(layout);

        cp.add(btn1);
        cp.add(btn2);
        cp.add(btn3);
        cp.add(btn4);
        cp.add(btn5);

        frame.pack();
        frame.setVisible(true);
    }
}
