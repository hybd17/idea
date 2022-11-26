package SwingStudy;

import javax.swing.*;
import java.awt.*;

//文本域组件
public class JF07 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout( new FlowLayout());
        jf.setBounds(400,300,300,250);
        JTextArea area = new JTextArea(20,10);
        //自动换行
        area.setLineWrap(true);
        jf.add(area);
        area.getText();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
