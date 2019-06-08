package chapter27;

import javax.swing.*;
import java.awt.*;

public class SWING {
    public static void main(String[] args) {
        var jframe = new JFrame("First Swing Application");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 종료시의 처리를 간편하게 지정 가능
        // 디폴트는 HIDE_ON_CLOSE여서 윈도우를 숨기기만 할 뿐 ,프로세스는 그대로 살아 있다.
        jframe.setPreferredSize(new Dimension(300,200));

        JLabel label1 = new JLabel("Swing", SwingConstants.CENTER);
        Container cp1 = jframe.getContentPane();
        cp1.add(label1);
        /*
        JLabel label2 = new JLabel("Swing", SwingConstants.LEFT);
        Container cp2 = jframe.getContentPane();
        cp2.add(label2);
        JLabel label3 = new JLabel("Swing", SwingConstants.RIGHT);
        Container cp3 = jframe.getContentPane();
        cp3.add(label3);
        */
        jframe.setLocation(500, 500);

        JButton btn1 = new JButton("one");
        JButton btn2 = new JButton("two");
        JButton btn3 = new JButton("three");
        JButton btn4 = new JButton("four");
        JButton btn5 = new JButton("five");

        Container cp = jframe.getContentPane();
        cp.add(btn1, BorderLayout.CENTER);
        cp.add(btn2, BorderLayout.EAST);
        cp.add(btn3, BorderLayout.WEST);
        cp.add(btn4, BorderLayout.SOUTH);
        cp.add(btn5, BorderLayout.NORTH);


        jframe.pack();
        jframe.setVisible(true);
    }
}
