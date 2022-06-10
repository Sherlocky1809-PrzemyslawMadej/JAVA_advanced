package Day2.task2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    private Chess repo;

    public Menu(Chess repo) {
        this.repo = repo;
    }

    public void startApp() {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Janek");
//        String result = list.get(0).toUpperCase();
//        list.set(0, result);
//        System.out.println(list);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Dokonaj wyboru (1 dodaj gracza, 2 wyswietl, 3 zmien na duze litery, 4 zmien na male litery) ");
            String inputText = scanner.nextLine();
            int input = Integer.valueOf(inputText);

            switch (input) {
                case 1:
                    System.out.print("Podaj imie gracza: ");
                    String name = scanner.nextLine();
                    repo.addChessPlayerToList(name);
                    break;
                case 2:
                    repo.displayListOfPlayers();
                    break;
                case 3:
                    repo.setNameToUppercase();
                    repo.displayListOfPlayers();
                    break;
                case 4:
                    repo.setNameToLowercase();
                    repo.displayListOfPlayers();
                    break;
                case 5:
                    System.out.println("Wychodze z programu");
                    System.exit(-1);
            }

        }
    }
}
