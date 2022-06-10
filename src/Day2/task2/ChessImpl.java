package Day2.task2;

import java.util.ArrayList;

public class ChessImpl implements Chess {

    private ArrayList<String> chessPlayers = new ArrayList<>();

    @Override
    public void addChessPlayerToList(String name) {
        if(!chessPlayers.contains(name)) {
            chessPlayers.add(name);
        }
    }

    @Override
    public void displayListOfPlayers() {
        System.out.println(chessPlayers);
    }

    @Override
    public void setNameToUppercase() {
        for (int i = 0; i < chessPlayers.size(); i++) {

            String result = chessPlayers.get(i).toUpperCase();
            chessPlayers.set(i, result);
        }
    }

    @Override
    public void setNameToLowercase() {
        for (int i = 0; i < chessPlayers.size(); i++) {

            String result = chessPlayers.get(i).toLowerCase();
            chessPlayers.set(i, result);
        }
    }
}
