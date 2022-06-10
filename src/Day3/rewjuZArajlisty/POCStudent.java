package Day3.rewjuZArajlisty;

import java.util.ArrayList;
import java.util.List;

public class POCStudent {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student rambo = new Student("Rambo", 8434242);
        Student rocky = new Student("Rocky", 6123422);
        Student terminator = new Student("Terminator", 6122282);

        students.add(rambo);
        students.add(rocky);
        students.add(terminator);
        System.out.println(students);

//        students.remove(rambo);
        Student ramboCopy = new Student("Rambo", 8434242); // taki sam obiekt co rambo - po nadpisaniu metody
        // equals();
        students.remove(ramboCopy);
        System.out.println(students);



    }
}
