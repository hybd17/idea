package csa03;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Character a = in.next().charAt(0);
        int n = in.nextInt();
        String s = Character.toString(a);
        Computer com;
        switch (s)
        {
            case "+":{
                com = new add();
                UseComputer.useCom(com,m,n);
                break;
            }
            case "-":{
                com = new delete();
                UseComputer.useCom(com,m,n);
                break;
            }
            case "*":{
                com = new mutiply();
                UseComputer.useCom(com,m,n);
                break;
            }
            case "/":{
                com = new divide();
                UseComputer.useCom(com,m,n);
                break;
            }
        }
    }
}
