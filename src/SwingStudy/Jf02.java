package SwingStudy;

import javax.swing.*;
import java.awt.*;

public class Jf02 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout( new FlowLayout());
        jf.setBounds(400,300,300,250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jButton = new JButton("01");
        jButton.setEnabled(true);
        //边界是否显示
        jButton.setBorderPainted(true);
        jf.add(jButton);
    }
}
