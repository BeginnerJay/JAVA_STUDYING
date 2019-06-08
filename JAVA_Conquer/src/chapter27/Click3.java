package chapter27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Click3 {
    public static void main(String[] args) {
        var jFrame = new JFrame("First Swing Application");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(800,600));
        jFrame.setLocation(500,500);

        var jButton = new JButton("Click");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "버튼을 클릭하였습니다.");
            }
        });

        var cp = jFrame.getContentPane();
        cp.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
