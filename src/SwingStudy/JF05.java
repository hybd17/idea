package SwingStudy;

import javax.swing.*;
import java.awt.*;

//菜单栏组件
public class JF05 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout( new FlowLayout());
        jf.setBounds(400,300,400,300);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("菜单一");
        JMenuItem item1 = new JMenuItem("选项一");
        JMenuItem item2 = new JMenuItem("选项二");
        JMenuItem item3 = new JMenuItem("选项三");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        bar.add(menu);
        jf.add(bar);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
