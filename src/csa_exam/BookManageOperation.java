package csa_exam;

import java.util.ArrayList;
import java.util.List;

public class BookManageOperation {
    BookData operation = new BookData();
    List<Books> books = operation.getAllBook();
    Books bookAll = new Books();
    public void showAllBooks(){
        for(int i = 0;i<books.size();i++)
        {
            Books bookTemp = books.get(i);
            System.out.println(bookTemp.toString());
        }
    }
    public boolean addBooks(String bookName, int leftNumber, String id){
        Books books1 = new Books(bookName,leftNumber,id);
        for (int i = 0; i < books.size(); i++) {
            Books bookTemp=books.get(i);
            if (bookTemp.getId().equals(id) || bookTemp.getBookName().equals(bookName)){
                System.err.println("您输入的图书已经存在了");
                return false;
            }
        }
        operation.addBook(books1);
        System.out.println("新增成功!");
        return true;
    }
    public boolean deleteBook(String id){
        for (int i = 0; i <books.size(); i++) {
            Books bookTemp=books.get(i);
            if(bookTemp.getId().equals(id)){
                books.remove(i);
                System.out.println("删除成功");
            }else{
                System.err.println("没有找到您要删除的图书编号！");
                return true;
            }
        }
        return false;
    }
    public boolean returnBooks(String id){
        for (int i = 0; i <books.size(); i++) {
            Books bookTemp=books.get(i);
            if(bookTemp.getId().equals(id)){
                System.out.println("归还成功");
            }else{
                System.err.println("没有找到您要删除的图书编号！");
                return true;
            }
        }
        return false;
    }
}
