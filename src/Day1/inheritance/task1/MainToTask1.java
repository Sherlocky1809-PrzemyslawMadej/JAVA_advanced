package Day1.inheritance.task1;

public class MainToTask1 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Przemek", 15000);

        employee1.show();

        Manager manager1 = new Manager("Jacek", 30000, 1000);

        manager1.makeSpeech("You're the best!");
        System.out.println(manager1.getSalary());
    }
}
