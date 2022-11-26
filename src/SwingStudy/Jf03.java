package SwingStudy;

import javax.swing.*;
import java.awt.*;

public class Jf03 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout( new FlowLayout());
        jf.setBounds(400,300,400,300);
//        JRadioButton jr1 = new JRadioButton("男");
//        JRadioButton jr2 = new JRadioButton("女");
//        //让只能选择一个
//        ButtonGroup group = new ButtonGroup();
//        group.add(jr1);
//        group.add(jr2);
//        jf.add(jr1);
//        jf.add(jr2);
        //可多选
//        JCheckBox jc1 = new JCheckBox("睡觉",true);//后面是默认是否选中
//        JCheckBox jc2 = new JCheckBox("敲代码",false);
//        JCheckBox jc3 = new JCheckBox("打游戏",false);
//        jf.add(jc1);
//        jf.add(jc2);
//        jf.add(jc3);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
