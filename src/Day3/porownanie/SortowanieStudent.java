package Day3.porownanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowanieStudent {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student rambo = new Student("Rambo", 5);
        Student rambo2 = new Student("Rambo", 214);
        Student rambo3 = new Student("Rambo", 1);
        Student rocky = new Student("Rocky", 86622293);
        Student terminator = new Student("Terminator", 866222343);

        students.add(terminator);
        students.add(rambo);
        students.add(rambo2);
        students.add(rambo3);
        students.add(rocky);
        System.out.println(students);

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
