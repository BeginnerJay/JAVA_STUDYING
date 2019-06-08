package chapter27;

import javax.swing.*;
import java.awt.*;

public class DrawLineSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setLocation(500, 500);

        Container cp = frame.getContentPane();
        DrawPanel surface = new DrawPanel();
        cp.add(surface);
        frame.pack();
        frame.setVisible(true);
    }
}
