package chapter27;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppleOrangeTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));
        frame.setLocation(500, 500);

        Container cp = frame.getContentPane();
        BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
        cp.setLayout(layout);

        JLabel fruit = new JLabel("Fruit");
        cp.add(fruit);

        JPanel panel = new JPanel();
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);

        JButton btnApple = new JButton("Apple");
        btnApple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                fruit.setText("Apple");
            }
        });
        panel.add(btnApple);

        JButton btnOrange = new JButton("Orange");
        btnOrange.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                fruit.setText("Orange");
            }
        });
        panel.add(btnOrange);

        cp.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
