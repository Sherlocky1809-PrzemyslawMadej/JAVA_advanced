package Kolekcje.task2;

import java.util.*;

public class BookServiceApp {

    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith", "Male");
        Author author2 = new Author("Jessica", "Albana", "Female");
        Author author3 = new Author("Roger", "Moore", "Male");
        Author author4 = new Author("Catherin", "Nadie", "Female");

        Book book1 = new Book("Book 1", 34.05, 2000,
                List.of(author1), FilmGenre.FANTASY);
        Book book2 = new Book("Book 2", 56.10, 1999,
                List.of(author2, author3, author4), FilmGenre.COMEDY);
        Book book3 = new Book("Book 3", 60.00, 1995,
                List.of(author3), FilmGenre.HISTORIC);

        IBookService bookService = new BookService();

        bookService.addBookToRepo(book1);
        bookService.addBookToRepo(book2);

        List<Book> listOfBooks = bookService.getListOfBooks();

//        bookService.removeBookFromRepo(book2);
//        List<Book> listOfBooks2 = bookService.getListOfBooks();

        List<Book> listOfFantasyBooks = bookService.getListOfFantasyBooks();

        List<Book> listOfPre1999Books = bookService.getListOfBooksPublicatedBefore1999();

        Book theMostExpensive = bookService.getTheMostExpensiveBook();

        Book theCheapest = bookService.getTheCheapestBook();

        Book threeAuthorsBook = bookService.getTheBookWithAtLeast3Authors();

        List<Book> sortedBooks = bookService.getSortedListOfBooksWithParameter(true);
        List<Book> reversedSortedBooks = bookService.getSortedListOfBooksWithParameter(false);

        boolean isPresent = bookService.checkIfBookIsPresentOnBookList(book1);
        boolean isPresent3 = bookService.checkIfBookIsPresentOnBookList(book3);

        List<Book> wroteByAuthor1 = bookService.getListOfBooksWroteByAuthor(author1);

        Map<FilmGenre, String> mapGenreTitle = bookService.getMapOfGenreAndTitleBooks(listOfBooks);

        Stack<Book> bookStack = bookService.getSortedStackOfBooksAccordingToPrice();

        System.out.println("Book service after adding books: " + listOfBooks);
        System.out.println("*********************");
//        System.out.println("Book service after removing books: " + listOfBooks2);
        System.out.println("*********************");
        System.out.println("Book service with fantasy books: " + listOfFantasyBooks);
        System.out.println("*********************");
        System.out.println("Book service with books older than 1999: " + listOfPre1999Books);
        System.out.println("*********************");
        System.out.println("The most expensive book: " + theMostExpensive);
        System.out.println("*********************");
        System.out.println("The cheapest book: " + theCheapest);
        System.out.println("*********************");
        System.out.println("The 3 authors or more book: " + threeAuthorsBook);
        System.out.println("*********************");
        System.out.println("Sorted list of Books: " + sortedBooks);
        System.out.println("*********************");
        System.out.println("Reversed sorted list of Books: " + reversedSortedBooks);
        System.out.println("*********************");
        System.out.println("If book1 is present on list: " + isPresent);
        System.out.println("If book3 is present on list: " + isPresent3);
        System.out.println("*********************");
        System.out.println("List of books wrote by author1: " + wroteByAuthor1);
        System.out.println("*********************");
        System.out.println("Map of genre and title of books: " + mapGenreTitle);
        System.out.println("*********************");
        System.out.println("Set of sorted price books: " + bookStack);
    }
}
