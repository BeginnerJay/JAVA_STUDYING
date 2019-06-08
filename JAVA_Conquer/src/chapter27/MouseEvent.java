package chapter27;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));
        frame.setLocation(500, 500);

        var label = new JLabel("Position", SwingConstants.CENTER);
        Container cp = frame.getContentPane();
        cp.add(label);

        label.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent event) {
                label.setText(String.format("X : %d ,Y : %d", event.getX(), event.getY()));
            }
        });

        /*
        label.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                label.setText(String.format("X : %d ,Y : %d",
                        java.awt.event.MouseEvent.getX(), java.awt.event.MouseEvent.getY()));
            }
        });
        */
        frame.pack();
        frame.setVisible(true);
    }
}
