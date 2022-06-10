package Day3.task1;
//Napisz program do przechowywania Pracownikow. Uzyj obiektu klasy Employee o polach name pesel eployeeId.
//        Program ma posiadac nastepujace funkcjonalnosci:
//        -dodaj pracownika do listy
//        -usun pracownika z listy korzystajac z name, employeeId, pesel
//        -wyswielt liste pracownikow
//        Menu:
//        1.dodaj pracownika
//        2.usun pracownika po employeeId
//        3. usun pracownika po pesel
//        4.wyswielt liste pracownikow
//        Rozwiaz zadanie uzywajac interfejsów
//        Lista pracownikow nie moze posiadac duplikatow

import java.util.Objects;

public class Employee {

    private String name;
    private int pesel;
    private int employeeID;

    public Employee(String name, int pesel, int employeeID) {
        this.name = name;
        this.pesel = pesel;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pesel=" + pesel +
                ", employeeID=" + employeeID +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return pesel == employee.pesel && employeeID == employee.employeeID && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel, employeeID);
    }
}
