package Day3.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPOC {

    public static void main(String[] args) {

//       Wyjatek to obiekt klasy, ktora dziedziczy po klasie Exception
//        String osoba = null;
//        osoba.length(); // NullPointerException

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Dokonaj wyboru pozycji menu: ");
            int menu = -1;

            // obsluga wyjatku, strategia przechwycenia bledu klauzula try catch

            try {
                menu = Integer.valueOf(scanner.nextLine()); // linijka gdzie wystapil blad
            } catch (NumberFormatException e) { // deklaruje ktory blad chce obsluzyc
               // do klauzuli catch wchodzimy tylko w przypadku wystapienia bledu zadeklarowanego w klauzuli
                e.printStackTrace(); // drukuje szczegoly bledu.
                System.out.println("UWAGA WYJATEK!!!!! ");
                continue; // przechodze od kolejnej iteracji petli w przypadku bledu
            }
            switch (menu) {
                case 1:
                    System.out.println("Dokonales wyboru jeden. ");
                    break;
                case 2:
                    System.out.println("Dokonales wyboru dwa. ");
            }
        }
        }
    }
