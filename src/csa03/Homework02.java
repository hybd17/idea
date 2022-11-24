package csa03;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int goals =  in.nextInt();
        if(goals>=0 && goals<=100){
            System.out.println("你的成绩是"+goals+"分");
        }
        else {
            throw new RuntimeException("请输入0-100的分数");
        }
    }
}
