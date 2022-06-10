package Day2.task1;

import java.util.Scanner;

public class Menu {

    private Digits sumOfDigits;

    public Menu(Digits sumOfDigits) {
        this.sumOfDigits = sumOfDigits;
    }

    public void startApp () {

//        Digits sumOfDigits = new Task1();

//        int digitsSum = fakeSumOfDigits.getDigitsSum(345);
//        System.out.println(digitsSum);

//        int digitsSum1 = sumOfDigits.getDigitsSum("12345");
//        System.out.println(digitsSum1);

        // MENU
//        1. Oblicz sumę cyfr.
//        2. Wyjdź z programu.

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Wybierz pozycję menu: ");
            String input = scanner.nextLine();
            int result = Integer.valueOf(input);

            switch (result) {
                case 1:
                    System.out.print("Podaj liczbe: ");
                    String number = scanner.nextLine();
                    System.out.println("Suma cyfr wynosi: " + sumOfDigits.getDigitsSum(number));
                    break;
                case 2:
                    System.out.println("Exit");
                    System.exit(-1);
            }
        }
    }
}
