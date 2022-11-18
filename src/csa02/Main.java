package csa02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("<-------第一题------->");
        Monkey mk = new Main().new Monkey();
        mk.setS("猴");
        System.out.println(mk.getS());
        mk.speak();
        People pl = new Main().new People();
        pl.setS("人");
        System.out.println(pl.getS());
        pl.speak();
        pl.think();

        System.out.println("<-------第二题------->");
        Car c1 = new Main().new Car();
        c1.setWheels(4);
        c1.setWeight(1150.0);
        c1.setLoaderFact(3);
        c1.summary();
        c1.judgePerson();
        System.out.println("---------------------");
        Truck t1 = new Main().new Truck();
        t1.setWheels(6);
        t1.setWeight(15000.0);
        t1.setLoaderFact(2);
        t1.setPlayloadFact(10000.0);
        t1.summary();
        t1.judgePerson();
        t1.judgePlayload();
        System.out.println("<-------第三题------->");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        getsum02(a,b);
        System.out.println("<-------第四题------->");
        int m = in.nextInt();
        int n = in.nextInt();
        answer as = new Main().new answer();
        System.out.println(as.uniquePaths(m,n));
        System.out.println("<-------第五题------->");

    }
    public static String getSum01(String a,String b){
        List<Integer> la = new ArrayList<Integer>();
        List<Integer> lb = new ArrayList<Integer>();
        String c = "";
        for(int i = a.length()-1;i>=0;--i){
            la.add(a.charAt(i)-'0');
        }
        for(int i=b.length()-1;i>=0;--i){
            lb.add(b.charAt(i)-'0');
        }

        return c;
    }
     public static void getsum02(String a,String b){
         BigDecimal la = new BigDecimal(String.valueOf(a));
         BigDecimal lb = new BigDecimal(String.valueOf(b));
         lb = lb.add(la);
         System.out.println(lb);
     }
     class Monkey{
        private String s;

        public Monkey() {
        }

        public Monkey(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
        public void speak(){
            System.out.println("咿咿呀呀......");
        }
    }

      class People extends Monkey{
        public People() {
        }

        public People(String s) {
            super(s);
        }

        @Override
        public void speak(){
            System.out.println("小样儿，不错嘛！会说话了！");
        }
        void think(){
            System.out.println("别说话！认真思考！");
        }
    }

     abstract class Vehicle{
        private int wheels;
        private double weight;

        public Vehicle() {
        }

        public Vehicle(int wheels, double weight) {
            this.wheels = wheels;
            this.weight = weight;
        }

        public int getWheels() {
            return wheels;
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
        public abstract void summary();
        public abstract void judgePerson();
    }

    class Car extends Vehicle{
        final int loader = 5;
        private int loaderFact;


        public Car() {
        }

//        public Car(int wheels, double weight, int loaderFact) {
//            super(wheels, weight);
//            this.loaderFact = loaderFact;
//        }

//        public int getLoaderFact() {
//            return loaderFact;
//        }

        public void setLoaderFact(int loaderFact) {
            this.loaderFact = loaderFact;
        }

        @Override
        public void setWheels(int wheels) {
            super.setWheels(wheels);
        }

        @Override
        public void setWeight(double weight) {
            super.setWeight(weight);
        }

        @Override
        public void summary() {
            System.out.println("车轮的数量是："+getWheels()+"个  车重："+getWeight());
        }

        @Override
        public void judgePerson() {
            System.out.print("这是一辆小车，能载"+loader+"人，实载"+loaderFact+"人");
            if(loaderFact>loader)
            {
                System.out.println(",你超员了！！！");
            }
            else
                System.out.println();
        }
    }

    class Truck extends Vehicle{
        final int loader = 3;
        final int playload = 5000;
        private int loaderFact;
        private double playloadFact;

        @Override
        public void setWeight(double weight) {
            super.setWeight(weight);
        }

        @Override
        public void setWheels(int wheels) {
            super.setWheels(wheels);
        }

        public Truck() {
        }

//        public Truck(int wheels, double weight, int loaderFact, double playloadFact) {
//            super(wheels, weight);
//            this.loaderFact = loaderFact;
//            this.playloadFact = playloadFact;
//        }
//
//        public int getLoaderFact() {
//            return loaderFact;
//        }

        public void setLoaderFact(int loaderFact) {
            this.loaderFact = loaderFact;
        }

//        public double getPlayloadFact() {
//            return playloadFact;
//        }

        public void setPlayloadFact(double playloadFact) {
            this.playloadFact = playloadFact;
        }

        @Override
        public void summary() {
            System.out.println("车轮的数量是："+getWheels()+"个  车重："+getWeight());
        }

        @Override
        public void judgePerson() {
            System.out.print("这是一辆卡车，能载"+loader+"人，实载"+loaderFact+"人");
            if(loaderFact>loader)
            {
                System.out.println(",你超员了！！！");
            }
            else System.out.println(    );
        }
        public void judgePlayload(){
            System.out.print("这是一辆卡车，核载"+playload+"kg，你已装载"+playloadFact+"kg");
            if(playloadFact>playload){
                System.out.println(",你超载了！！！");
            }
            else
            {
                System.out.println();
            }
        }
    }
    class answer{
        public int uniquePaths(int m,int n){
            int dp[][] = new int[m][n];
            for(int i = 0;i< dp.length;i++)
            {
                for(int k = 0;k<dp[i].length;k++)
                {
                    if(i==0 || k==0)
                    {
                        dp[i][k] = 1;
                    }
                    else
                    {
                        dp[i][k] = dp[i-1][k]+dp[i][k-1];
                    }
                }
            }
            return dp[m-1][n-1];
        }
        public String longestCommonPrefix(String[] strs){
            if(strs==null){
                return "";
            }
            int length = strs[0].length();
            for(int i = 0;i<length;i++)
            {
                char c = strs[0].charAt(i);
                for(int k = 1;k< strs.length;k++)
                {
                    if(i == strs[k].length() || strs[k].charAt(i) != c)
                    {
                        return  strs[0].substring(0,i);
                    }
                }
            }
            return strs[0];
        }
    }
}
