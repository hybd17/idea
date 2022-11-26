package SwingStudy;

import javax.swing.*;
import java.awt.*;

//常用布局
public class JF008 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout(new GridLayout(3,3,10,20));
//        jf.setLayout( new BorderLayout());
        jf.setBounds(400,300,300,250);
//        JButton jb1 = new JButton("A");
//        JButton jb2 = new JButton("B");
//        JButton jb3 = new JButton("C");
//        JButton jb4 = new JButton("D");
//        JButton jb5 = new JButton("E");
//        jf.add(jb1,BorderLayout.NORTH);
//        jf.add(jb2,BorderLayout.EAST);
//        jf.add(jb3,BorderLayout.SOUTH);
//        jf.add(jb4,BorderLayout.WEST);
//        jf.add(jb5,BorderLayout.CENTER);
        JButton jb1 = new JButton("A");
        JButton jb2 = new JButton("B");
        JButton jb3 = new JButton("C");
        JButton jb4 = new JButton("D");
        JButton jb5 = new JButton("E");
        JButton jb6 = new JButton("F");
        JButton jb7 = new JButton("G");
        JButton jb8 = new JButton("H");
        JButton jb9 = new JButton("I");
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.add(jb7);
        jf.add(jb8);
        jf.add(jb9);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
