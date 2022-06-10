package Day3.rewjuZArajlisty;

import java.util.Objects;

public class Student {

    private String name;
    private int index;

    public Student(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return index == student.index && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, index);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ",index=" + index +
                '}';
    }
}
