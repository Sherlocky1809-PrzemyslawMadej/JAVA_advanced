package Generyki.task4;

import java.util.Objects;

public class Newspaper {

    private String name;
    private String publishingHouse;
    private int noOfPublication;

    public Newspaper(String name, String publishingHouse, int noOfPublication) {
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.noOfPublication = noOfPublication;
    }

    public String getName() {
        return name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getNoOfPublication() {
        return noOfPublication;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", noOfPublication=" + noOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Newspaper newspaper = (Newspaper) o;
        return noOfPublication == newspaper.noOfPublication && Objects.equals(name, newspaper.name)
                && Objects.equals(publishingHouse, newspaper.publishingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishingHouse, noOfPublication);
    }
}
