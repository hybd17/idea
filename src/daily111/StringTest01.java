package daily111;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args){
        String username = "itheima";
        String password = "czbk";
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<3;i++)
        {
            System.out.println("请输入用户名:");
            String name = in.nextLine();
            System.out.println("请输入密码:");
            String pwd = in.nextLine();
            if(username.equals(name) && password.equals(pwd))
            {
                System.out.println("登陆成功");
                break;
            }
            else
            {
                if(2-i==0)
                {
                    System.out.println("您的账号被锁定，请与管理员联系");
                }
                else
                {
                    System.out.println("登陆失败，你还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
