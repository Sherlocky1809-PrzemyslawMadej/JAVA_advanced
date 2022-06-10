package homeWork.task1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepoImpl implements StudentRepo{

    List<Student> localStudents = new ArrayList<>();
    List<Student> allStudents = new ArrayList<>();

    @Override
    public void addStudentsToList1(Student student) {
        localStudents.add(student);
    }

    @Override
    public void addStudentsToList2(Student student) {
        allStudents.add(student);
    }

    @Override
    public void printListOfStudents1() {
        localStudents.stream()
                .forEach(x -> System.out.println(x));
    }

    @Override
    public void printListOfStudents2() {
        allStudents.stream()
                .forEach(x -> System.out.println(x));
    }

    @Override
    public int countMissingStudents() {
        int counter = 0;
        for (Student student: allStudents) {
            for (Student localStudent: localStudents) {
                if (localStudent.equals(student)) {
                    counter++;
                    break;
                }
            }
        }
        return allStudents.size() - counter;
    }

    @Override
    public Student[] findMissingStudents() {

        List<Student> allStudentsCopy = new ArrayList<>(allStudents);

        for (int i = 0; i < allStudentsCopy.size(); i++) {
            for (int j = 0; j < localStudents.size(); j++) {
                if (allStudentsCopy.get(i).equals(localStudents.get(j))) {
                    allStudentsCopy.remove(allStudentsCopy.get(i));
                    i--;
                    break;
                }
            }
        }
        return allStudentsCopy.toArray(new Student[countMissingStudents()]);
    }

    @Override
    public StudentReconciliatonTrade compareListsOfStudents() {
        return new StudentReconciliatonTrade(countMissingStudents(), findMissingStudents());
    }
}
