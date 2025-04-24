package codefinity;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> BookList  = new ArrayList<>();

    public Library(List<Book> bookList) {
        BookList = bookList;
    }

    public Library() {
    }

    public void addBook(Book book) {
        BookList.add(book);
    }

    public void removeBookById(int id) {
        for (Book book: BookList) {
            if (book.getId() == id) {
                BookList.remove(book);
            }
        }
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: BookList) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book: BookList) {
            if (book.getYear() > year && !result.contains(book)) {
                result.add(book);
            }
        }
        return result;
    }

    public void displayAllBooks() {
        System.out.println(BookList);
    }
}
