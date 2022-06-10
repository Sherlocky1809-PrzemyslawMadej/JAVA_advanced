package Generyki.task4;

import java.util.Objects;

public class Movie {

    private String title;
    private String director;
    private int yearOfFirstRun;

    public Movie(String title, String director, int yearOfFirstRun) {
        this.title = title;
        this.director = director;
        this.yearOfFirstRun = yearOfFirstRun;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearOfFirstRun() {
        return yearOfFirstRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return yearOfFirstRun == movie.yearOfFirstRun && Objects.equals(title, movie.title)
                && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, yearOfFirstRun);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfFirstRun=" + yearOfFirstRun +
                '}';
    }
}
