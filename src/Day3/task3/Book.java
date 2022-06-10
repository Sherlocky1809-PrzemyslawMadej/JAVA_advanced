package Day3.task3;

//Klasa BookRepository
//        Zaimplementuj klasę BookRepository , która będzie odpowiedzialna za:
//        dodawanie obiektów typu Book
//        usuwanie obiektów typu Book
//        wyszukiwanie obiektów typu Book o wskazanej nazwie
//        wyszukiwanie obiektu typu Book o wskazanym id
//        usuwanie obiektów typu Book na podstawie przekazanego id
//        Klasa Book
//        Klasa Book powinna zawierać poniższe pola:
//        isbn
//        tytuł
//        autor
//        rok wydania
//        NoBookFoundException
//        W przypadku braku jakichkolwiek rezultatów wyszukiwania, powinien zostać
//        wyrzucony wyjątek: NoBookFoundException . Wyjątek ten powinien być
//        własnoręcznie zaimplementowanym wyjątkiem, przyjmujący jako parametr
//        konstruktora obiekt typu String z informacją jakich elementów nie udało się
//        odszukać.

import java.util.Objects;

public class Book {

    private int isbn;
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(int isbn, String title, String author, int yearOfPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, yearOfPublication);
    }
}
