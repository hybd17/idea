package SwingStudy;

import javax.swing.*;
import java.awt.*;

//下拉列表
public class JF04 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout( new FlowLayout());
        jf.setBounds(400,300,400,300);
        JComboBox box = new JComboBox();
        box.addItem("--请选择学历--");
        box.addItem("高中");
        box.addItem("大学");
        box.addItem("研究生");
        jf.add(box);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
