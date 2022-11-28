package csa_exam;

import java.io.Serializable;

public class Books implements Serializable {
    private String bookName;
    private int leftNumber;
    private String id;

    public Books() {
        super();
    }

    public Books(String bookName, int leftNumber, String id) {
        this.bookName = bookName;
        this.leftNumber = leftNumber;
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[书名是"+bookName+",书籍编号是"+id+",剩余"+leftNumber+"本]";
    }
}
