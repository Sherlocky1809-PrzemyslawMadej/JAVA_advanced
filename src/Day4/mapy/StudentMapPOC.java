package Day4.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentMapPOC {

    public static void main(String[] args) {

//        lewa strona interface, tym razem mamy mapowanie String -> Student
        Map<String, Student> students = new HashMap<>();

        Student rambo = new Student("Rambo", "554321", "234252533" );
        Student rocky = new Student("Rocky", "554325", "234252500" );
        Student terminator = new Student("Terminator", "002325", "111252500" );

//        lista studentow
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(rambo);
        studentsList.add(rocky);
        studentsList.add(terminator);

        for (Student student: studentsList) {
            students.put(student.getPesel(), student);
        }

        System.out.println(students);
        rambo.setIndex("psikus");
        System.out.println(students);
        System.out.println("Hashcode: " + rocky.hashCode());


    }
}
