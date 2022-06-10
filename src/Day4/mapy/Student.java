package Day4.mapy;

import java.util.Objects;

public class Student {

    private String name;
    private String index;
    private String pesel;

    public Student(String name, String index, String pesel) {
        this.name = name;
        this.index = index;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", index='" + index + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(index, student.index) && Objects.equals(pesel, student.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, index, pesel);
    }
}
