package chapter27;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setLocation(500, 500);

        JButton btn1 = new JButton("one");
        JButton btn2 = new JButton("two");
        JButton btn3 = new JButton("three");

        Container cp = frame.getContentPane();
        CardLayout layout = new CardLayout();
        cp.setLayout(layout);

        cp.add(btn1, "first");
        cp.add(btn2, "second");
        cp.add(btn3, "third");

        var listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.next(cp);
            }
        };
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);

        frame.pack();
        frame.setVisible(true);
    }
}
