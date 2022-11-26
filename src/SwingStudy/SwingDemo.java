package SwingStudy;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录");
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(460,300,300,200);
        JLabel label1 = new JLabel("账号:");
        JTextField usenameText = new JTextField("",30);
        JLabel label2 = new JLabel("密码:");
        JPasswordField pwd = new JPasswordField("",30);
        JTextField out = new JTextField("登录状态",30);
        JButton jb = new JButton("登录");
        jb.setSize(40,20);
        jf.add(label1);
        jf.add(usenameText);
        jf.add(label2);
        jf.add(pwd);
        jf.add(out);
        jf.add(jb);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
