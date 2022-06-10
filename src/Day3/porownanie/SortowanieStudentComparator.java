package Day3.porownanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowanieStudentComparator {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();


        Student rambo = new Student("Rambooooooo", 1);
        Student rocky = new Student("Rocky", 86622293);
        Student terminator = new Student("Terminator", 866222343);

        students.add(terminator);
        students.add(rambo);
        students.add(rocky);
        System.out.println(students);

        StudentComparator studentComparator = new StudentComparator();
        Collections.sort(students, studentComparator);
        System.out.println(students);

    }
}
