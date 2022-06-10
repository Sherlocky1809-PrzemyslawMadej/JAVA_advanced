package homeWork.task1;

import java.util.Arrays;

public class StudentReconciliatonTrade {

    private int counter;
    private Student[] missingStudents;

    public StudentReconciliatonTrade(int counter, Student[] missingStudents) {
        this.counter = counter;
        this.missingStudents = missingStudents;
    }

    public int getCounter() {
        return counter;
    }

    public Student[] getMissingStudents() {
        return missingStudents;
    }

    @Override
    public String toString() {
        return "StudentReconciliatonTrade{" +
                "counter=" + counter +
                ", missingStudents=" + Arrays.toString(missingStudents) +
                '}';
    }
}
