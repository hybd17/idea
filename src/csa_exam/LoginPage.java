package csa_exam;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginPage extends users{
    JFrame login = new JFrame();
    users us01 = new users();
    public void init(){
        JPanel allPanel = new JPanel();
        Box allBox = Box.createVerticalBox();
//        JLabel LoginLabel = new JLabel("注册页面");
//        Box LoginBox = Box.createHorizontalBox();
//        LoginBox.add(LoginLabel);
//        Font zi=new Font("黑体", Font.BOLD,20);
//        LoginLabel.setFont(zi);
        //用户名
        Box username = Box.createHorizontalBox();
        JLabel usernameLabel = new JLabel("用户名:");
        JTextField usernameField = new JTextField("",20);
        username.add(usernameLabel);
        username.add(Box.createHorizontalStrut(15));
        username.add(usernameField);
        //密码
        Box password = Box.createHorizontalBox();
        JLabel passwordLabel = new JLabel("密    码:");
        JTextField passwordField = new JTextField("",20);
        password.add(passwordLabel);
        password.add(Box.createHorizontalStrut(15));
        password.add(passwordField);
        //学号
        Box studentID = Box.createHorizontalBox();
        JLabel studentIDLabel = new JLabel("学    号:");
        JTextField studentIDField = new JTextField("",20);
        studentID.add(studentIDLabel);
        studentID.add(Box.createHorizontalStrut(15));
        studentID.add(studentIDField);
        //判断需知
        JCheckBox checkBox = new JCheckBox("您已阅读用户需知",false);
        //性别
        Box sexBox = Box.createHorizontalBox();
        JLabel sexLabel = new JLabel("性    别:");
        ButtonGroup sex = new ButtonGroup();
        JRadioButton male = new JRadioButton("男",true);
        JRadioButton female = new JRadioButton("女",false);
        sex.add(male);
        sex.add(female);
        sexBox.add(sexLabel);
        sexBox.add(Box.createHorizontalStrut(10));
        sexBox.add(male);
        sexBox.add(female);
        //按钮
        Box buttonBox = Box.createHorizontalBox();
        JButton registerButton = new JButton("注册");
        registerButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = passwordField.getText().trim();
                String studentID = studentIDField.getText().trim();
                String gender = sex.isSelected(male.getModel())?male.getText():female.getText();
                String check = checkBox.isSelected()? checkBox.getText() : "";
                if(username.equals("")||password.equals("")||studentID.equals("")||check.equals(""))
                {
                    us01.setUsernameData(username);
                    us01.setPasswordData(password);
                    us01.setStudentIDData(studentID);
                    us01.setGenderData(gender);
                    login.dispose();
                    new loginFault().init();
                }
                else {
                    login.dispose();
                    new MainView().init();
                }
            }
        });
        buttonBox.add(Box.createHorizontalStrut(80));
        buttonBox.add(registerButton);
        //组装
        allBox.add(Box.createVerticalStrut(50));
        allBox.add(username);
        allBox.add(Box.createVerticalStrut(20));
        allBox.add(password);
        allBox.add(Box.createVerticalStrut(20));
        allBox.add(studentID);
        allBox.add(Box.createVerticalStrut(20));
        allBox.add(sexBox);
        allBox.add(Box.createVerticalStrut(20));
        allBox.add(checkBox);
        allBox.add(Box.createVerticalStrut(20));
        allBox.add(buttonBox);
        allPanel.add(allBox);
        login.add(allPanel);
        login.setBounds((Screen.getwidth()-300)/2,(Screen.getheight()-400)/2,300,400);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginPage().init();
    }
}
