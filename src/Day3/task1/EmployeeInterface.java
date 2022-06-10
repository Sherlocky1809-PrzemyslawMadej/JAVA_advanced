package Day3.task1;

import java.util.List;

public interface EmployeeInterface {
    //        Menu:
//        1.dodaj pracownika
//        2.usun pracownika po employeeId
//        3. usun pracownika po pesel
//        4.wyswielt liste pracownikow
//        Rozwiaz zadanie uzywajac interfejsów
//        Lista pracownikow nie moze posiadac duplikatow

        void addEmployee(Employee employee);
        void removeEmployee(Employee employee);
        void removeEmployeeByID(int employeeID);
        void removeEmployeeByPesel(int pesel);
        void printListEmployees();
}
