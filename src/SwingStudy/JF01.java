package SwingStudy;

import javax.swing.*;
import java.awt.*;

public class JF01 {
    public static void main(String[] args) {
//        j1.setSize(400,300);
//        j1.setLocation(400,300);
        JFrame jf = new JFrame("JFrame");
        jf.setBounds(400,300,400,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        JDialog jd = new JDialog(jf,"JD");
//        jd.setBounds(400,300,400,300);
//        jd.setVisible(true);
//        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        JButton jb1 = new JButton("01");
//        JButton jb2 = new JButton("02");
//        JPanel jp = new JPanel(new FlowLayout());
//        jp.add(jb1);
//        jp.add(jb2);
//        jf.add(jp);
        JLabel jLabel = new JLabel("账号",SwingConstants.CENTER);
        jf.add(jLabel);
    }
}
