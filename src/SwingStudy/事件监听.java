package SwingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 事件监听 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("监听事件测试");
        jf.setBounds(400,300,300,300);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextArea text = new JTextArea(10,20);
        text.setLineWrap(true);
        JButton jb = new JButton("马老师");
        jf.add(text);
        jf.add(jb);
        jb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("年轻人耗子尾汁");
            }
        });

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
