package csa_exam;


import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainView extends users{
    JFrame main = new JFrame("欢迎来到图书管理系统");
    public void init(){
        main.setBounds((Screen.getwidth()-500)/2,(Screen.getheight()-250)/2,500,250);
        JPanel allPanel = new JPanel();
        Box allBox = Box.createVerticalBox();
        Box username = Box.createHorizontalBox();
        JLabel usernameLabel = new JLabel("用户名:");
        JTextField nameField = new JTextField("",20);
        Box password = Box.createHorizontalBox();
        JLabel passwordLabel = new JLabel("密  码:");
        JPasswordField passwordField = new JPasswordField("",20);
        username.add(usernameLabel);
        username.add(Box.createHorizontalStrut(15));
        username.add(nameField);
        password.add(passwordLabel);
        password.add(Box.createHorizontalStrut(20));
        password.add(passwordField);
        //按钮处理 -- 交互
        Box buttonBox = Box.createHorizontalBox();
        JButton login = new JButton("登录");
        JButton register = new JButton("注册");
        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nameField.getText().trim().equals("")||passwordField.getPassword().equals(""))
                {
                    main.dispose();
                    new enterFault().init();
                }
                else {
                    main.dispose();
                    new bookManage().init();
                }
            }
        });
        register.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.dispose();
                new LoginPage().init();
            }
        });
        buttonBox.add(login);
        buttonBox.add(Box.createHorizontalStrut(30));
        buttonBox.add(register);
        //组装整体
        allBox.add(Box.createVerticalStrut(30));
        allBox.add(username);
        allBox.add(Box.createVerticalStrut(30));
        allBox.add(password);
        allBox.add(Box.createVerticalStrut(30));
        allBox.add(buttonBox);
        allPanel.add(allBox);
        main.add(allPanel);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainView().init();
    }
}
