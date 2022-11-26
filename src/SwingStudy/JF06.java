package SwingStudy;

import javax.swing.*;
import java.awt.*;

//文本组件
public class JF06 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setLayout( new FlowLayout(FlowLayout.LEFT));
        jf.setBounds(400,300,300,300);
        JLabel label = new JLabel("账号：");
        JTextField text =new JTextField("",22);
        jf.add(label);
        jf.add(text);
        JLabel label2 = new JLabel("密码：");
        JPasswordField pwd = new JPasswordField("",20);
        pwd.setEchoChar('*');
        jf.add(label2);
        jf.add(pwd);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
