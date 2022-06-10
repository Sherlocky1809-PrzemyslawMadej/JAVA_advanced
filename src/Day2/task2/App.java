package Day2.task2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Menu menu = new Menu(new ChessImpl());
        Chess repo = new ChessImpl();
        menu.startApp();

    }
}
