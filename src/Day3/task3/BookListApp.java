package Day3.task3;

public class BookListApp {

    public static void main(String[] args) {

        BookRepository repository = new BookRepositoryImpl();

        Book book1 = new Book(232323, "Zemsta", "Fredro", 1890);

        repository.addBookToRepo(book1);
        System.out.println(repository);

//        repository.removeBookFromRepo(book1);
//        System.out.println(repository);

//        System.out.println(repository.searchBookByName("Ze"));
//        System.out.println(repository.searchBookByID(232));

        repository.removeBookByID(232);
        System.out.println(repository);


    }
}
