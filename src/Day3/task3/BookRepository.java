package Day3.task3;

public interface BookRepository {

    void addBookToRepo(Book book);
    void removeBookFromRepo(Book book);
    Book searchBookByName(String name);
    Book searchBookByID(int id);
    void removeBookByID(int id);

}
