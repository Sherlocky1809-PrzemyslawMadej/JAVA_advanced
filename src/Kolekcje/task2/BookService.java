package Kolekcje.task2;

import java.util.*;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class BookService implements IBookService {

    List<Book> listOfBooks = new ArrayList<>();

    @Override
    public void addBookToRepo(Book book) {
        listOfBooks.add(book);
    }

    @Override
    public void removeBookFromRepo(Book book) {
        listOfBooks.remove(book);
    }

    @Override
    public List<Book> getListOfBooks() {
        return new ArrayList<>(listOfBooks);
    }

    @Override
    public List<Book> getListOfFantasyBooks() {
        return listOfBooks.stream()
                .filter(book -> book.getFilmGenre() == FilmGenre.FANTASY)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getListOfBooksPublicatedBefore1999() {
        return listOfBooks.stream()
                .filter(book -> book.getYearOfPublication() <= 1999)
                .collect(Collectors.toList());
    }

    @Override
    public Book getTheMostExpensiveBook() {
        return listOfBooks.stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElse(null);
    }

    @Override
    public Book getTheCheapestBook() {
        return listOfBooks.stream()
                .min(Comparator.comparing(Book::getPrice))
                .orElse(null);
    }

    @Override
    public Book getTheBookWithAtLeast3Authors() {
        return listOfBooks.stream()
                .filter(book -> book.getAuthors().size() >= 3)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> getSortedListOfBooksWithParameter(boolean increasingly) {

        List<Book> sortedListOfBooks = new ArrayList<>(listOfBooks);

        if(increasingly) {
            sortedListOfBooks.sort(Comparator.comparing(Book::getTitle));
        } else {
            sortedListOfBooks.sort(Comparator.comparing(Book::getTitle).reversed());
        }

        return sortedListOfBooks;
    }

    @Override
    public boolean checkIfBookIsPresentOnBookList(Book searchedBook) {
        return listOfBooks.contains(searchedBook);
    }

    @Override
    public List<Book> getListOfBooksWroteByAuthor(Author author) {
        return listOfBooks.stream()
                .filter(book -> book.getAuthors().contains(author))
                .collect(Collectors.toList());
    }

    public Map<FilmGenre, String> getMapOfGenreAndTitleBooks(List<Book> listOfBooks) {

        Map<FilmGenre,String> genreStringMap = new HashMap<>();

        for (Book book: listOfBooks) {
            genreStringMap.put(book.getFilmGenre(), book.getTitle());
        }
        return genreStringMap;
    }

    @Override
    public Stack<Book> getSortedStackOfBooksAccordingToPrice() {

        Collections.sort(listOfBooks, Comparator.comparingDouble(new ToDoubleFunction<Book>() {
            @Override
            public double applyAsDouble(Book value) {
                return -value.getPrice();
            }
        }));

        Stack<Book> bookStack = new Stack<>();

        for (Book book: listOfBooks) {
            bookStack.push(book);
        }

        return bookStack;
    }


}
