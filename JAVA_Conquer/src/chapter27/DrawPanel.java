package chapter27;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    public void paint(Graphics g) {
        g.drawLine(10, 10, 100, 100);
        g.drawOval(100, 10, 100, 100);
        g.drawRect(10, 120, 200, 50);
        g.setColor(Color.blue);
        g.fillOval(250, 10, 100, 100);
        g.setColor(Color.red);
        g.fillRect(250, 120, 100, 50);

        g.setColor(Color.blue);
        for (int i = 0 ; i < arPt.size() - 1; i++) {
            if (arPt.get(i + 1).draw) {
                g.drawLine(arPt.get(i).x, arPt.get(i).y, arPt.get(i + 1).x, arPt.get(i + 1).y);
            }
        }
    }

    ArrayList<Vertex> arPt;
    DrawPanel(ArrayList<Vertex> arPt) {
        this.arPt = arPt;
    }

    DrawPanel() {}
}
