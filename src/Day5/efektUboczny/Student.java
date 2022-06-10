package Day5.efektUboczny;

public class Student { // ReconciliationResultCounter klasa ma stan i funkcje

    // Stan obiektu
    private String name;
    private int index;

    public Student(String name, int index) {
        this.name = name;
        this.index = index;
    }

// funkcje, czyli metody

    public String getName() {
        return name;
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
                '}';
    }
}
