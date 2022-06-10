package Day3.task1;

//        Menu:
//        1.dodaj pracownika
//        2.usun pracownika po employeeId
//        3. usun pracownika po pesel
//        4.wyswielt liste pracownikow
//        Rozwiaz zadanie uzywajac interfejsów
//        Lista pracownikow nie moze posiadac duplikatow

import java.util.Scanner;

public class MenuToEmployeesApp {

    public void init () {

        Scanner scanner = new Scanner(System.in);
        EmployeeInterface repo = new EmployeeRepo();

        while(true) {
            System.out.print("Wybierz pozycje menu: ");
            String input = scanner.nextLine(); // Dlaczego zwraca mi pusty string?
            int result = Integer.valueOf(input);

            switch (result) {
                case 1:
                    System.out.println("Dodaj pracownika do listy: ");
                    System.out.print("Podaj imie pracownika: ");
                    String nameFromUser = scanner.nextLine();
                    System.out.print("Podaj pesel pracownika: ");
                    int peselFormUser = scanner.nextInt();
                    System.out.print("Podaj ID pracownika: ");
                    int employeeIDFromUser= scanner.nextInt();

                    repo.addEmployee(new Employee(nameFromUser, peselFormUser, employeeIDFromUser));
                    System.out.println(repo);
                    break;

                case 2:
                    System.out.print("Podaj ID pracownika do usuniecia: ");
                    int inputIDFromUser = scanner.nextInt();
                    repo.removeEmployeeByID(inputIDFromUser);
                    break;

                case 3:
                    System.out.print("Podaj PESEL pracownika do usuniecia: ");
                    int peselFromUser1 = scanner.nextInt();
                    repo.removeEmployeeByPesel(peselFromUser1);
                    break;

                case 4:
                    System.out.println("Wyswietlam liste pracownikow: ");
                    repo.printListEmployees();
                    break;

                default:
                    System.out.println("Podaj wlasciwa wartosc opcji menu. ");
            }
        }
    }
}
