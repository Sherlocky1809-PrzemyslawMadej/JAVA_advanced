package Day3.porownanie;

public class Student implements Comparable<Student> {

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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}' + '\n';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getName().compareTo(o.getName());

        if (result == 0) {
            result = Integer.compare(this.getIndex(), o.getIndex());
        }
        return result;
    }
}
