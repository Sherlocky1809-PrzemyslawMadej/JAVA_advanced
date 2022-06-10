package Generyki.task4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Potop", "Sienkiewicz", 1880);
        Book book2 = new Book("Wesele", "Wyspianski", 1910);

        Library<Book> bookLibrary = new Library<>(List.of(book1, book2));
        System.out.println(bookLibrary);

        Movie movie1 = new Movie("Rambo", "Stallone", 1985);
        Movie movie2 = new Movie("Gladiator", "Scott", 2000);

        Library<Movie> movieLibrary = new Library<>(List.of(movie1, movie2));
        System.out.println(movieLibrary);
    }
}
