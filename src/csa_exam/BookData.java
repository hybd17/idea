package csa_exam;

import java.util.ArrayList;
import java.util.List;

public class BookData implements Booksinterface{
    List<Books> booksArrayList = new ArrayList<Books>();
    public void init(){
        Books book1=new Books("水浒传",10,"CQUPT11111");
        Books book2=new Books("红楼梦",10,"CQUPT22222");
        Books book3=new Books("三国演义",10,"CQUPT33333");
        Books book4=new Books("西游记",10,"CQUPT44444");
        Books book5=new Books("java三天速成",10,"CQUPT55555");
        booksArrayList.add(book1);
        booksArrayList.add(book2);
        booksArrayList.add(book3);
        booksArrayList.add(book4);
        booksArrayList.add(book5);
    }

    @Override
    public List<Books> getAllBook() {
        return booksArrayList;
    }

    @Override
    public boolean addBook(Books books) {
        return booksArrayList.add(books);
    }

    @Override
    public boolean deleteBook(Books books) {
        return false;
    }
}
