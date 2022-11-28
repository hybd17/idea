package csa_exam;

import java.util.Scanner;

public class bookManageTrue {
    Scanner in = new Scanner(System.in);
    BookManageOperation operationnow = new BookManageOperation();
    public bookManageTrue(){
            operationnow.operation.init();
    }
    public void showFunction(){
        while (true){
            System.out.println("------欢迎使用图书管理系统--------");
            System.out.println("-----------------------------");
            System.out.println("1.查询所有书籍");
            System.out.println("2.增加书籍");
            System.out.println("3.删除图书");
            System.out.println("4.归还图书");
            System.out.println("-----------------------------");
            System.out.println("请选择您的服务项目1-4:");
            int select = in.nextInt();
            switch (select){
                case 1:
                    showAllBooks();
                    break;
                case 2:
                    addBooks();
                    break;
                case 3:
                    deleteBooks();
                    break;
                case 4:
                    returnBooks();
                    break;
                default:
                    System.out.println("您所选的服务不在列表内呢，请您重新选择");
            }
        }
    }
    public void showAllBooks(){
        operationnow.showAllBooks();
    }
    public void addBooks(){
        System.out.println("请输入增加书的名称:");
        String name = in.next();
        System.out.println("请输入增加书的本数:");
        int leftNumber = in.nextInt();
        System.out.println("请输入书的编号:");
        String id = in.next();
        operationnow.addBooks(name,leftNumber,id);
    }
    public void deleteBooks(){
        System.out.println("请输入书的编号:");
        String id = in.next();
        operationnow.deleteBook(id);
    }
    public void returnBooks(){
        System.out.println("请输入书的编号:");
        String id = in.next();
        operationnow.returnBooks(id);
    }
}
