package Day3.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BookRepositoryImpl implements BookRepository {

    private List<Book> bookList = new ArrayList<>();

    @Override
    public void addBookToRepo(Book book) {
        bookList.add(book);
    }

    @Override
    public void removeBookFromRepo(Book book) {
        bookList.remove(book);
    }

    @Override
    public Book searchBookByName(String name) {
        for (Book book: bookList) {
           if(book.getTitle().equals(name)) {
               return book;
           }
        }
//        return null;
        throw new NoBookFoundException("nie znaleziono ksiazki o tytule: " + name);
    }

    @Override
    public Book searchBookByID(int id) {
        for (Book book: bookList) {
            if(book.getIsbn() == id) {
                return book;
            }
        }
//        return null;
        throw new NoBookFoundException("nie znaleziono ksiazki o ID: " + id);
    }

    @Override
    public void removeBookByID(int id) {
        Book book = searchBookByID(id);
        removeBookFromRepo(book);
    }

    @Override
    public String toString() {
        return "BookRepositoryImpl{" +
                "bookList=" + bookList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRepositoryImpl that = (BookRepositoryImpl) o;
        return Objects.equals(bookList, that.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookList);
    }
}
