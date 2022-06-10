package Kolekcje.task2;

import java.util.Objects;

public class Author {
//    Zaimplementuj klasę Author , która będzie zawierać pola: imię, nazwisko, płeć.
//    Uwzględnij wszystkie niezbędne meotody oraz parametry konstruktora.
//    Zaimplementuj klasę i equals .

    private String name;
    private String surname;
    private String sex;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public Author(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(sex, author.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, sex);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
