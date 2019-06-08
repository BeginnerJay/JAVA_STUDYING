package chapter27;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FreeLineSwing {
    static ArrayList<Vertex> arPt = new ArrayList<Vertex>();
    static boolean down = false;
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setLocation(500, 500);

        Container cp = frame.getContentPane();
        DrawPanel surface = new DrawPanel(arPt);
        cp.add(surface);

        /*
        label.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent event) {
                label.setText(String.format("X : %d ,Y : %d", event.getX(), event.getY()));
            }
        });
         */


        surface.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                //super.mousePressed(e);
                if (e.getModifiersEx() == /*MouseEvent*/InputEvent.BUTTON1_DOWN_MASK) {
                    arPt.add(new Vertex(e.getX(), e.getY(), false));
                    System.out.println(e.getX() + "," + e.getY() + " : no draw");
                }
            }
        });

        surface.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent event) {
                if (event.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
                    arPt.add(new Vertex(event.getX(), event.getY(), true));
                    System.out.println(event.getX() + "," + event.getY() + " : draw");
                }
                surface.repaint();
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
