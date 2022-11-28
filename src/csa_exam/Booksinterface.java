package csa_exam;

import java.util.List;

public interface Booksinterface {
    public List<Books> getAllBook();
    public boolean addBook(Books books);
    public boolean deleteBook(Books books);
}
