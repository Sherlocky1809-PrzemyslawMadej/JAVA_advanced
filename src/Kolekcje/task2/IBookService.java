package Kolekcje.task2;

//Zaimplementuj klasę BookService , która będzie zawierać w sobie listę książek,
//        oraz będzie realizować poniższe metody:
//        dodawanie książek do listy
//        hashCode
//        Fantasy
//        rosnąco/malejąco
//        100
//        0-50
//        usuwanie książek z listy
//        zwracanie listy wszystkich książek
//        zwracanie książek typu
//        zwracanie książek wydanych przed rokiem
//        zwracanie najdroższej książki
//        zwracanie najtańszej książki
//        zwracanie książki z conajmniej
//        zwracanie listy wszystkich książek posortowanych zgodnie z przekazanym
//        parametrem:
//        sprawdzanie czy konkretna książka znajduje się na liście
//        zwracanie listy książek napisanych przez konkretnego autora

import java.util.List;
import java.util.Map;
import java.util.Stack;

public interface IBookService {

    void addBookToRepo(Book book);
    void removeBookFromRepo(Book book);
    List<Book> getListOfBooks();
    List<Book> getListOfFantasyBooks();
    List<Book> getListOfBooksPublicatedBefore1999();
    Book getTheMostExpensiveBook();
    Book getTheCheapestBook();
    Book getTheBookWithAtLeast3Authors();
    List<Book> getSortedListOfBooksWithParameter(boolean increasingly);
    boolean checkIfBookIsPresentOnBookList(Book searchedBook);
    List<Book> getListOfBooksWroteByAuthor(Author author);
    Map<FilmGenre, String> getMapOfGenreAndTitleBooks(List<Book> listOfBooks);
    Stack<Book> getSortedStackOfBooksAccordingToPrice();



}
