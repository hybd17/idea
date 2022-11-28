package csa_exam;

import javax.swing.*;
import java.awt.event.ActionEvent;

//图书管理界面由于时间不够以及暂时没有学会数据库所以暂时在命令行中实现，管理页面具体代码可看bookManageTrue
public class bookManage {
    JFrame manage = new JFrame("图书管理页面");
    bookManageTrue bookManageTrue = new bookManageTrue();

    public void init(){
        manage.setBounds((Screen.getwidth()-800)/2,(Screen.getheight()-500)/2,800,500);
        JPanel allPanel = new JPanel();
        Box allBox = Box.createVerticalBox();
        Box buttonBox = Box.createHorizontalBox();
        JButton add = new JButton("添加书籍");
        JButton search = new JButton("搜索书籍");
        JButton jump = new JButton("跳转");
        jump.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manage.dispose();
                new bookManageTrue().showFunction();
            }
        });
        buttonBox.add(add);
        buttonBox.add(search);
        buttonBox.add(jump);
        JTextArea jTextArea = new JTextArea(30,30);
        jTextArea.append("图书管理界面由于时间不够以及暂时没有学会数据库所以暂时在命令行中实现，管理页面具体实施可点击”跳转“按钮");
        allBox.add(buttonBox);
        allBox.add(jTextArea);
        allPanel.add(allBox);
        manage.add(allPanel);
        manage.setVisible(true);
        manage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new bookManage().init();
    }
}
