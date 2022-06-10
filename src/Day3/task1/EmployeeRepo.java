package Day3.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EmployeeRepo implements EmployeeInterface {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
    employeeList.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void removeEmployeeByID(int id) {
        Employee employeeById = getEmployeeById(id);
        removeEmployee(employeeById);
    }

    @Override
    public void removeEmployeeByPesel(int pesel) {

        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getPesel() == pesel) {
                iterator.remove();
            }
        }
    }

//    @Override
//    public void removeEmployeeByName(String name) {
//      POPDUCHA
//    }

    @Override
    public void printListEmployees() {
        System.out.println(this.employeeList);
    }

    private Employee getEmployeeById(int id) {
        for (Employee employee: employeeList) {
            if(employee.getEmployeeID() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return employeeList.toString();
    }
}
