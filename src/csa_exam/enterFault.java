package csa_exam;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class enterFault {
    JFrame jf = new JFrame("提示");
    public void init(){
        JPanel allPanel = new JPanel();
        Box allBox = Box.createVerticalBox();
        JLabel tips = new JLabel("您输入的信息有误，请检查后重新输入");
        Box buttonBox = Box.createHorizontalBox();
        JButton confirm = new JButton("确认");
        confirm.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.dispose();
                new MainView().init();
            }
        });
        buttonBox.add(Box.createHorizontalStrut(80));
        buttonBox.add(confirm);
        allBox.add(Box.createVerticalStrut(30));
        allBox.add(tips);
        allBox.add(Box.createVerticalStrut(20));
        allBox.add(buttonBox);
        allPanel.add(allBox);
        jf.add(allPanel);
        jf.setBounds((Screen.getwidth()-300)/2,(Screen.getheight()-180)/2,300,180);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new loginFault().init();
    }
}
