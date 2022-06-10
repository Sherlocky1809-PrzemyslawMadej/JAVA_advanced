package Kolekcje.task2;

import java.util.List;
import java.util.Objects;

public class Book {

//    Zaimplementuj klasę Book , która będzie zawierać pola: tytuł, cena, rok wydania
//    oraz lista autorów, gatunek (reprezentowany jako klasa enum). Uwzględnij
//    wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj klasę hashCode
//    i equals .

    private String title;
    private double price;
    private int yearOfPublication;
    private List<Author> authors;
    private FilmGenre filmGenre;

    public Book(String title, double price, int yearOfPublication, List<Author> authors, FilmGenre filmGenre) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.authors = authors;
        this.filmGenre = filmGenre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public FilmGenre getFilmGenre() {
        return filmGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(authors, book.authors) && filmGenre == book.filmGenre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfPublication, authors, filmGenre);
    }

    @Override
    public String toString() {
        return '\n' + "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", authors=" + authors +
                ", filmGenre=" + filmGenre +
                '}';
    }
}
