package homeWork.task1;

//Napisz program ktory porownuje zawartosc dwoch grup Studentow.
//        Pola klasy student name,surname, index
//        Porownujemy dwie Listy.
//        Jako rezultat zwracamy obiekt klasy
//        StudentReconciliatonTrade pola:
//private int counter
//private Student[] missingStudents

public interface StudentRepo {

    void addStudentsToList1(Student student);
    void addStudentsToList2(Student student);
    void printListOfStudents1();
    void printListOfStudents2();
    int countMissingStudents();
    Student[] findMissingStudents();
    StudentReconciliatonTrade compareListsOfStudents();

}
